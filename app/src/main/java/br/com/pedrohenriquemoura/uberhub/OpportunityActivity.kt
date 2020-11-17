package br.com.pedrohenriquemoura.uberhub

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.pedrohenriquemoura.uberhub.model.Opportunity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase


class OpportunityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opportunity)

        val btnSave = findViewById<Button>(R.id.btn_save)

        btnSave.setOnClickListener {
            saveOpportunity()
        }
    }

    fun saveOpportunity() {
        val organization = findViewById<EditText>(R.id.organization)
        val title = findViewById<EditText>(R.id.titulo)
        val description = findViewById<EditText>(R.id.description)
        val value = findViewById<EditText>(R.id.value)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
        val status = findViewById<EditText>(R.id.status)

        // [START write_message]
        // Write a message to the database
        // [START write_message]
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("opportunity")

        val opportunity = Opportunity(organization.text.toString(), title.text.toString(), description.text.toString(),
                                      value.text.toString(), email.text.toString(), phone.text.toString(), status.text.toString())

        database.reference.child("opportunity").child("2").setValue(opportunity)
        // [END write_message]

        // [START read_message]
        // Read from the database
        // [END write_message]

        // [START read_message]
        // Read from the database
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)!!
                Toast.makeText(baseContext, "Value is: $value",
                    Toast.LENGTH_SHORT).show()
                //Log.d(FragmentActivity.TAG, "Value is: $value")
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Toast.makeText(baseContext, "Failed to read value.",
                    Toast.LENGTH_SHORT).show()
                //Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })
        // [END read_message]
    }
}
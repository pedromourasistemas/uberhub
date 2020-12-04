package br.com.pedrohenriquemoura.uberhub.ui.signin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import br.com.pedrohenriquemoura.uberhub.OpportunityActivity
import br.com.pedrohenriquemoura.uberhub.R
import com.google.firebase.auth.FirebaseAuth

class SigninActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

        setContentView(R.layout.activity_signin)

        // Initialize Firebase Auth
        /*auth = Firebase.auth

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val linkSignup = findViewById<TextView>(R.id.link_signup)
        val login = findViewById<Button>(R.id.login)
        val loading = findViewById<ProgressBar>(R.id.loading)

        login.setOnClickListener {
            var email = username.text.trim().toString()
            var password = password.text.trim().toString()

            signinUser(email, password)
        }

        linkSignup.setOnClickListener {
            val signupActivity = Intent(this, SignupActivity::class.java)
            startActivity(signupActivity)
            finish()
        }*/

    }

    fun signinUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser

                    Toast.makeText(baseContext, "Usuário logado com sucesso!",
                        Toast.LENGTH_SHORT).show()

                    val activity = Intent(this, OpportunityActivity::class.java)
                    startActivity(activity)
                    finish()
                } else {
                    Toast.makeText(baseContext, "Login falhou!",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }

}
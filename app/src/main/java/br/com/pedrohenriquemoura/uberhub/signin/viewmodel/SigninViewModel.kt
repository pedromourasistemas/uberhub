package br.com.pedrohenriquemoura.uberhub.signin.viewmodel

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import com.google.firebase.auth.FirebaseAuth

class SigninViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var auth: FirebaseAuth

    // - Implementar o login por email e senha
    /*fun signinUser(context: Context, email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(context) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser

                    Toast.makeText(context, "Usuário logado com sucesso!",
                        Toast.LENGTH_SHORT).show()

                    //val intent = Intent(context, OpportunityActivity::class.java)
                    //context.startActivity(intent)
                } else {
                    Toast.makeText(context, "Login falhou!",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }*/
}
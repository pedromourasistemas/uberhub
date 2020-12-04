package br.com.pedrohenriquemoura.uberhub.ui.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.pedrohenriquemoura.uberhub.R
import br.com.pedrohenriquemoura.uberhub.ui.signup.SignupActivity
import kotlinx.android.synthetic.main.activity_signin_initial.*

class SigninInitialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_signin_initial)

        btn_create_account.setOnClickListener {
            var intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        btn_signin.setOnClickListener {
            var intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }
    }
}
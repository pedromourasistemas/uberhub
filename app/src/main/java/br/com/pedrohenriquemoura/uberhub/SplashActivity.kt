package br.com.pedrohenriquemoura.uberhub

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import br.com.pedrohenriquemoura.uberhub.signin.view.SigninInitialActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val activity = Intent(this, SigninInitialActivity::class.java)
            startActivity(activity)
            finish()
        }, 4000)
    }
}
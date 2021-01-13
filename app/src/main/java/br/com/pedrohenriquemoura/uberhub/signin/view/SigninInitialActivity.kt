package br.com.pedrohenriquemoura.uberhub.signin.view

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.pedrohenriquemoura.uberhub.R
import br.com.pedrohenriquemoura.uberhub.base.UberhubBaseActivity
import br.com.pedrohenriquemoura.uberhub.databinding.ActivitySigninInitialBinding
import br.com.pedrohenriquemoura.uberhub.signup.view.SignupActivity

class SigninInitialActivity : UberhubBaseActivity() {

    //region Attributes

    var binding: ActivitySigninInitialBinding? = null

    //endregion

    //region Methods Override

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_signin_initial)

        setUpViews()
        setUpListeners()
    }

    override fun setUpViews() {

    }

    override fun setUpListeners() {
        binding?.btnCreateAccount?.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

        binding?.btnSignin?.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
        }
    }

    //endregion
}
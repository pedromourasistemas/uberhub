package br.com.pedrohenriquemoura.uberhub.signin.view

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import br.com.pedrohenriquemoura.uberhub.R
import br.com.pedrohenriquemoura.uberhub.base.UberhubBaseActivity
import br.com.pedrohenriquemoura.uberhub.signin.viewmodel.SigninViewModel

class SigninActivity : UberhubBaseActivity() {

    private val viewModel: SigninViewModel by lazy {
        ViewModelProvider(this).get(
            SigninViewModel::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

        setContentView(R.layout.activity_signin)
    }

    override fun setUpViews() {
        TODO("Not yet implemented")
    }

    override fun setUpListeners() {
        TODO("Not yet implemented")
    }
}
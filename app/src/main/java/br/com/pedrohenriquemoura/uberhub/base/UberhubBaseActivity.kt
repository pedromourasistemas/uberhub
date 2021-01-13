package br.com.pedrohenriquemoura.uberhub.base

import androidx.appcompat.app.AppCompatActivity

abstract class UberhubBaseActivity : AppCompatActivity() {

    abstract fun setUpViews()
    abstract fun setUpListeners()
}
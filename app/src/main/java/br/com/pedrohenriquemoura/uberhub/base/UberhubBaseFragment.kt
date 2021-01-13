package br.com.pedrohenriquemoura.uberhub.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class UberhubBaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViews()
        setUpListeners()
    }

    abstract fun setUpViews()
    abstract fun setUpListeners()
}
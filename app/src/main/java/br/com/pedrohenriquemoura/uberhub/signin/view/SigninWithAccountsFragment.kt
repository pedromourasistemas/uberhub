package br.com.pedrohenriquemoura.uberhub.signin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import br.com.pedrohenriquemoura.uberhub.R
import br.com.pedrohenriquemoura.uberhub.base.UberhubBaseFragment
import br.com.pedrohenriquemoura.uberhub.databinding.FragmentSigninWithAccountsBinding

class SigninWithAccountsFragment : UberhubBaseFragment() {

    //region Attributes

    private var binding: FragmentSigninWithAccountsBinding? = null

    //endregion

    //region Methods Override

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentSigninWithAccountsBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun setUpViews() {

    }

    override fun setUpListeners() {
        binding?.btnAccountUberhub?.setOnClickListener {
            view?.findNavController()?.navigate(R.id.SigninInformationEmailFragment)
        }
    }

    //endregion
}
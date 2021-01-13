package br.com.pedrohenriquemoura.uberhub.signin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import br.com.pedrohenriquemoura.uberhub.R
import br.com.pedrohenriquemoura.uberhub.base.UberhubBaseFragment
import br.com.pedrohenriquemoura.uberhub.databinding.FragmentSigninInformationEmailBinding
import br.com.pedrohenriquemoura.uberhub.databinding.FragmentSigninWithAccountsBinding
import br.com.pedrohenriquemoura.uberhub.signin.viewmodel.SigninViewModel

class SigninInformationEmailFragment : UberhubBaseFragment() {

    //region Attributes

    private var binding: FragmentSigninInformationEmailBinding? = null
    private val viewModel: SigninViewModel by lazy {
        ViewModelProvider(this).get(
            SigninViewModel::class.java
        )
    }

    //endregion

    //region Methods Override

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentSigninInformationEmailBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun setUpViews() {

    }

    override fun setUpListeners() {
        binding?.btnContinue?.setOnClickListener {
            view?.findNavController()?.navigate(R.id.SigninInformationPasswordFragment)
        }
    }

    //endregion
}
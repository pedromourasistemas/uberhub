package br.com.pedrohenriquemoura.uberhub.signin.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.pedrohenriquemoura.uberhub.R
import br.com.pedrohenriquemoura.uberhub.base.UberhubBaseFragment
import br.com.pedrohenriquemoura.uberhub.databinding.FragmentSigninInformationEmailBinding
import br.com.pedrohenriquemoura.uberhub.databinding.FragmentSigninInformationPasswordBinding
import kotlinx.android.synthetic.main.activity_signup.view.*

class SigninInformationPasswordFragment : UberhubBaseFragment() {

    //region Attributes

    private var binding: FragmentSigninInformationPasswordBinding? = null

    //endregion

    //region Methods Override

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSigninInformationPasswordBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun setUpViews() {

    }

    override fun setUpListeners() {
        /*binding?.btnAccountUberhub?.setOnClickListener {
            view?.findNavController()?.navigate(R.id.SigninInformationEmailFragment)
        }*/
    }

    //endregion
}
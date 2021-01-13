package br.com.pedrohenriquemoura.uberhub.base

import android.view.View
import androidx.navigation.fragment.NavHostFragment

public abstract class FlowActivity<T : BaseViewModel> public constructor(modelClass: Class<T>) :
    UberhubBaseActivity() {

    private final var loadingView: View? = null
    private final val modelClass: Class<T> = TODO()
    protected final lateinit var navHostFragment: NavHostFragment
    private final val navigationOnClickListener: View.OnClickListener
    protected final lateinit var viewModel: T
    public abstract fun navigationID() : Int
    public abstract fun menuResId() : Int
}
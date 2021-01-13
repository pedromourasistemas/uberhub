package br.com.pedrohenriquemoura.uberhub.base

import android.app.Application
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel

public abstract class BaseViewModel public constructor(applicationBase: Application) : AndroidViewModel(applicationBase) {
    public abstract fun restoreState(inState: Bundle) : Unit
    public abstract fun saveState(outState: Bundle) : Unit
}
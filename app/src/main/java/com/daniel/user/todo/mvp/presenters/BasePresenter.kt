package com.daniel.user.todo.mvp.presenters

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.daniel.user.todo.mvp.views.BaseView

abstract class BasePresenter<T : BaseView> : ViewModel() {
    protected var mView: T? = null

    val errorLD = MutableLiveData<String>()

    open fun initPresenter(mView: T) {
        this.mView = mView
    }

}
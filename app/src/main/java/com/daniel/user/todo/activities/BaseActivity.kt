package com.daniel.user.todo.activities

import android.support.v7.app.AppCompatActivity
import com.daniel.user.todo.mvp.presenters.BasePresenter
import com.daniel.user.todo.mvp.views.BaseView

abstract class BaseActivity<P : BasePresenter<V>, V : BaseView> : AppCompatActivity(), BaseView {

//    protected lateinit var presenter: P
//    set

//    protected abstract fun onCreatePresenter(): P

}
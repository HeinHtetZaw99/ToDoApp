package com.daniel.user.todo.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.daniel.user.todo.mvp.presenters.BasePresenter
import com.daniel.user.todo.mvp.views.BaseView

abstract class BaseActivity<P : BasePresenter<V>, V : BaseView> : AppCompatActivity(), BaseView {

    protected lateinit var presenter: P

    protected abstract fun onCreatePresenter(): P

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        presenter = onCreatePresenter().apply {
            initPresenter(this@BaseActivity as V)
        }
    }
}
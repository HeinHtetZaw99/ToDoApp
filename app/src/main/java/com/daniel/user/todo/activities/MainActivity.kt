package com.daniel.user.todo.activities

import android.os.Bundle
import com.daniel.user.todo.R
import com.daniel.user.todo.mvp.presenters.MainPresenter
import com.daniel.user.todo.mvp.views.BaseView
import com.daniel.user.todo.mvp.views.MainView

class MainActivity : BaseActivity<MainPresenter, MainView>(), BaseView {
    override fun onCreatePresenter(): MainPresenter {
        return presenter
    }

    override fun showError() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

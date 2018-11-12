package com.daniel.user.todo.activities

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.daniel.user.todo.R
import com.daniel.user.todo.adapters.TodoItemAdapter
import com.daniel.user.todo.delegates.TodoItemDelegate
import com.daniel.user.todo.mvp.presenters.MainPresenter
import com.daniel.user.todo.mvp.views.MainView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_pod_empty.*

class MainActivity : BaseActivity<MainPresenter, MainView>(), MainView, TodoItemDelegate {


    lateinit var mAdapter: TodoItemAdapter
    lateinit var presenter: MainPresenter


    override fun showError() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = ViewModelProviders.of(this).get(MainPresenter::class.java)
        presenter.initPresenter(this)
        mainRv.layoutManager = LinearLayoutManager(this)
        mAdapter = TodoItemAdapter(this, this)
        mainRv.adapter = mAdapter
//        mainRv.setEmptyView(emptyView)
        emptyView.visibility = View.GONE
        refreshBtn.setOnClickListener {
            mainRv.removeAllViews()
        }
    }


    override fun onTapDelete(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTapUpdate(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTapCreate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLongClick() {

    }
}

package com.daniel.user.todo.adapters

import android.content.Context
import android.view.ViewGroup
import com.daniel.user.todo.R
import com.daniel.user.todo.data.vos.DummyVO
import com.daniel.user.todo.delegates.TodoItemDelegate
import com.daniel.user.todo.viewholders.TodoViewholder

class TodoItemAdapter(context: Context, var delegate: TodoItemDelegate) :
    BaseRecyclerAdapter<TodoViewholder, DummyVO>(context) {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TodoViewholder {
        val view = mLayoutInflater.inflate(R.layout.item_todo_list, p0, false)
        return TodoViewholder(view, delegate)
    }

}
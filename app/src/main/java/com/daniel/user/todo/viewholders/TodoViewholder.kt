package com.daniel.user.todo.viewholders

import android.util.Log
import android.view.View
import android.widget.TextView
import com.daniel.user.todo.data.vos.DummyVO
import com.daniel.user.todo.delegates.TodoItemDelegate
import kotlinx.android.synthetic.main.item_todo_list.view.*

class TodoViewholder(itemView: View, var delegate: TodoItemDelegate) : BaseViewHolder<DummyVO>(itemView) {
    var longClicked = false

    override fun setData(data: DummyVO) {
        itemView.contentEdtx.visibility = View.GONE

        itemView.editBtn.setOnClickListener {
            Log.d("TODO", "Some things has edited")
            it.contentTv.visibility = View.GONE
            it.contentEdtx.visibility = View.VISIBLE
            it.contentEdtx.setText(itemView.contentTv.text, TextView.BufferType.EDITABLE)
        }

    }

    override fun onClick(v: View?) {
        itemView.contentTv.isChecked = !itemView.contentTv.isChecked
    }

    override fun onLongClick(v: View?): Boolean {
        longClicked = longClicked == false
        if (longClicked) {
            itemView.editBtn.visibility = View.VISIBLE
            itemView.deleteBtn.visibility = View.VISIBLE
        } else {
            itemView.editBtn.visibility = View.GONE
            itemView.deleteBtn.visibility = View.GONE
        }
        return true
    }

}
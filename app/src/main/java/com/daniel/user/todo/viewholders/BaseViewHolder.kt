package com.daniel.user.todo.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<W>(itemView: View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener, View.OnLongClickListener {

    protected var mData: W? = null
    abstract fun setData(data: W)

    init {
        itemView.setOnLongClickListener(this)
    }

}

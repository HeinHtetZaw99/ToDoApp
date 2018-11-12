package com.daniel.user.todo.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import com.daniel.user.todo.viewholders.BaseViewHolder
import java.util.*


abstract class BaseRecyclerAdapter<T : BaseViewHolder<W>, W>(context: Context) :
    RecyclerView.Adapter<T>() {

    protected var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    protected var mData: MutableList<W>? = null

    val items: List<W>
        get() {
            val data: List<W>? = mData
            return data ?: ArrayList()
        }

    init {
        mData = ArrayList()
        mLayoutInflater = LayoutInflater.from(context)
    }

    override fun onBindViewHolder(holder: T, position: Int) {
//        holder.setData(mData!![position])
    }

    override fun getItemCount(): Int {
//        return mData!!.size
        Log.d("TODO", "Data size for dummy is 20")
        return 20
    }

    fun setNewData(newData: List<W>) {
        clearData()
        mData!!.addAll(newData)
        notifyDataSetChanged()
    }

    fun appendNewData(newData: List<W>) {
        val start = mData!!.size
        val count = newData.size
        mData!!.addAll(newData)
        notifyItemRangeInserted(start, count)
    }

    fun getItemAt(position: Int): W? {
        return if (position in 0..mData!!.lastIndex) mData!![position] else null
    }

    fun removeData(data: W) {
        val index = mData!!.indexOf(data)
        mData!!.remove(data)
        notifyItemRemoved(index)
    }

    fun addNewData(data: W) {
        mData!!.add(data)
        notifyItemInserted(mData!!.lastIndex)
    }

    fun clearData() {
        if (mData!!.isNotEmpty()) {
            mData!!.clear()
        }
        notifyDataSetChanged()
    }
}

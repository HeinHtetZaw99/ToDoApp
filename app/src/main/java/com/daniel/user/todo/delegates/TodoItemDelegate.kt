package com.daniel.user.todo.delegates

interface TodoItemDelegate {
    fun onTapDelete(id: String)
    fun onTapUpdate(id: String)
    fun onTapCreate()
}
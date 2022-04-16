package com.johannliebert.yarube.ui.todo_list

import com.johannliebert.yarube.data.TODO

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: TODO):  TodoListEvent()
    data class OnDoneChange(val todo:TODO, val isDone: Boolean): TodoListEvent()

    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: TODO) : TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}

package com.johannliebert.yarube.data


import kotlinx.coroutines.flow.Flow

interface TodoRepository {

    suspend fun insertTodo(todo:TODO)

    suspend fun deleteTodo(todo:TODO)

    suspend fun getTodoById(id:Int): TODO?

    fun getTodos(): Flow<List<TODO>>

}
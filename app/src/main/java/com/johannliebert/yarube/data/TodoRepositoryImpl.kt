package com.johannliebert.yarube.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
): TodoRepository {
    override suspend fun insertTodo(todo: TODO) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: TODO) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): TODO? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<TODO>> {
        return dao.getTodos()
    }
}
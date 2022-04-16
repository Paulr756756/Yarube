package com.johannliebert.yarube.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TODO::class],
    version = 1
)

abstract class TodoDatabase: RoomDatabase() {
    abstract val dao: TodoDao
}
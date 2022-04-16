package com.johannliebert.yarube.di

import android.app.Application
import androidx.room.Room
import com.johannliebert.yarube.data.TodoDatabase
import com.johannliebert.yarube.data.TodoRepository
import com.johannliebert.yarube.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton

    //database dependency provided here
    fun provideTodoDatabase(app: Application): TodoDatabase{
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }



    @Provides
    @Singleton

    //repository dependencies provided here
    fun provideTodoRepository(db:TodoDatabase): TodoRepository{
        return TodoRepositoryImpl(db.dao)
    }
}
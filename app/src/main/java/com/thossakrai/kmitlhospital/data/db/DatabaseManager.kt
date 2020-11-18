package com.thossakrai.kmitlhospital.data.db

import android.content.Context
import androidx.room.Room

object DatabaseManager {
    private lateinit var appDatabase: AppDatabase

    fun init(context: Context) {
        appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "app-db.db").build()
    }

    fun get(): AppDatabase = appDatabase
}

package com.example.trashhack_app.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        LoginEntity :: class,
        RequestEntity :: class
    ],
    version = 1
)
abstract class MainDatabase : RoomDatabase(){
    abstract val Logindao: LoginDao
    companion object{
        fun createDataBase(context: Context, nameDb :String): MainDatabase{
            return Room.databaseBuilder(
                context,
                MainDatabase :: class.java,
                "$nameDb.db"
            ).build()
        }
    }
}

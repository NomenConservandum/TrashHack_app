package com.example.trashhack_app.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface LoginDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertItem(nameEntity: LoginEntity)

    @Update
    suspend fun updateItem(nameEntity: LoginEntity)

    @Delete
    suspend fun deleteItem(nameEntity: LoginEntity)

    @Query("SELECT * FROM loginTable")
    fun getAllItems(): Flow<List<LoginEntity>>

}
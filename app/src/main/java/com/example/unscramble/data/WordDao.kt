package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Query("SELECT * FROM custom_words")
    fun getAllCustomWords(): Flow<List<CustomWord>>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: CustomWord)
}
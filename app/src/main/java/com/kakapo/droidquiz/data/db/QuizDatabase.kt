package com.kakapo.droidquiz.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kakapo.droidquiz.data.model.Answer
import com.kakapo.droidquiz.data.model.Question

@Database(entities = [(Question::class), (Answer::class)], version = 1)
abstract class QuizDatabase: RoomDatabase() {

}
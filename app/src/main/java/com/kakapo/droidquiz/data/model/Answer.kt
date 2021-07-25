package com.kakapo.droidquiz.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "answer")
data class Answer(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "answer_id")
    var answerId: Int,
    @ColumnInfo(name = "question_id")
    val questionId: Int,
    @ColumnInfo(name = "is_correct")
    var isCorrect : Boolean,
    var text: String
)
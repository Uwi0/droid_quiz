package com.kakapo.droidquiz.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "question_id")
    var questionId: Int,
    var text: String
)
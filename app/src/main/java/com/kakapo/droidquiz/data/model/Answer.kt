package com.kakapo.droidquiz.data.model

import androidx.room.*
import androidx.room.ForeignKey.CASCADE

@Entity(
    tableName = "answer",
    foreignKeys = [
        ForeignKey(entity = Question::class,
        parentColumns = ["question_id"],
        childColumns = ["question_id"],
        onDelete = CASCADE
        )
    ],
indices = [Index("question_id")])
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
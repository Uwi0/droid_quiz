package com.kakapo.droidquiz.data.model

import androidx.room.Embedded
import androidx.room.Relation

class QuestionAndAllAnswer {
    @Embedded
    var question: Question? = null

    @Relation(parentColumn = "question_id", entityColumn = "question_id")
    var answer: List<Answer> = ArrayList()
}
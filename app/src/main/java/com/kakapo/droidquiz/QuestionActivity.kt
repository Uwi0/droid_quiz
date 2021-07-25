package com.kakapo.droidquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
    }

    fun nextQuestion(view: View) {}
}
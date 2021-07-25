package com.kakapo.droidquiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kakapo.droidquiz.R

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
    }

    fun nextQuestion(view: View) {}
}
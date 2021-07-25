package com.kakapo.droidquiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kakapo.droidquiz.R
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }

    fun playAgain(view: View) = startActivity(intentFor<MainActivity>().newTask().clearTask())
}
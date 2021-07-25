package com.kakapo.droidquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
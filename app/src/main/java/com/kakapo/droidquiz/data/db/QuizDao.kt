package com.kakapo.droidquiz.data.db

import androidx.room.*
import com.kakapo.droidquiz.data.model.Answer
import com.kakapo.droidquiz.data.model.Question
import com.kakapo.droidquiz.data.model.QuestionAndAllAnswer

@Dao
interface QuizDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(answer: Answer)

    @Query("DELETE FROM questions")
    fun clearQuestions()

    @Delete
    fun deleteQuestion(question: Question)

    @Query("SELECT * FROM questions ORDER BY question_id")
    fun getAllQuestions() : List<Question>

    @Transaction
    @Query("SELECT * FROM questions")
    fun getAllQuestionAndAnswer() : List<QuestionAndAllAnswer>
}
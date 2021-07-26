package com.kakapo.droidquiz

import android.content.Context
import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.kakapo.droidquiz.data.QuestionInfoProvider
import com.kakapo.droidquiz.data.db.QuizDao
import com.kakapo.droidquiz.data.db.QuizDatabase
import com.kakapo.droidquiz.data.model.Question
import org.junit.*
import org.junit.rules.TestRule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class QuizDaoTest {

    @Rule
    @JvmField
    val rule: TestRule = InstantTaskExecutorRule()

    private lateinit var database: QuizDatabase
    private lateinit var quizDao: QuizDao

    @Before
    fun setUp(){
        val context: Context = InstrumentationRegistry.getInstrumentation().context

        try{
            database = Room.inMemoryDatabaseBuilder(context, QuizDatabase::class.java)
                .allowMainThreadQueries()
                .build()
        }catch (e: Exception){
            Log.i(this.javaClass.simpleName, e.message!!)
        }

        quizDao = database.quizDao()
    }

    @Test
    fun testInsertQuestion(){
        val previousNumberOfQuestions = quizDao.getAllQuestions().size
        val question = Question(1, "What is your name")
        quizDao.insert(question)

        val numberOfQuestions = quizDao.getAllQuestions().size

        val numberOfNewQuestion = numberOfQuestions - previousNumberOfQuestions

        Assert.assertEquals(1, numberOfNewQuestion)

        quizDao.clearQuestions()

        Assert.assertEquals(0, quizDao.getAllQuestions().size)
    }

    @Test
    fun testClearQuestions(){
        for (question in QuestionInfoProvider.questionList){
            quizDao.insert(question)
        }

        Assert.assertTrue(quizDao.getAllQuestions().isNotEmpty())
        Log.d("testData", quizDao.getAllQuestions().toString())
        quizDao.clearQuestions()
        Assert.assertTrue(quizDao.getAllQuestions().isEmpty())
    }

    @After
    fun tearDown(){
        database.close()
    }
}
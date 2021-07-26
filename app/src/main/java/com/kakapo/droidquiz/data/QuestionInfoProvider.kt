package com.kakapo.droidquiz.data

import com.kakapo.droidquiz.data.model.Answer
import com.kakapo.droidquiz.data.model.Question

object QuestionInfoProvider {

    var questionList = initQuestionList()
    var answerList = initAnswerList()

    private fun initQuestionList(): MutableList<Question> {

        val question = mutableListOf<Question>()
        val question1 = Question(
            1,
            "Which of the following languages is not commonly used to develop Android Apps"
        )
        question.add(question1)

        val question2 = Question(
            2,
            "What is the meaning of life?"
        )

        return question
    }

    private fun initAnswerList(): MutableList<Answer> {

        val answer = mutableListOf<Answer>()
        val answer1 = Answer(1, 1, true, "Java")
        answer.add(answer1)

        val answer2 = Answer(2, 1, false, "Kotlin")
        answer.add(answer2)

        val answer3 = Answer(3, 1, false, "Ruby")
        answer.add(answer3)

        val answer4 = Answer(4, 2, true, "42")
        answer.add(answer4)

        val answer5 = Answer(5, 2, false, "35")
        answer.add(answer5)

        val answer6 = Answer(6, 2, false, "7")
        return answer
    }
}
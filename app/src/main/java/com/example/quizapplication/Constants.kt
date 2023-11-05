package com.example.quizapplication

import com.example.quizapplication.Question
import com.example.quizapplication.R

object Constants {

    const val USER_NAME : String = "userName"
    const val TOTAL_QUESTIONS : String = "totalQuestions"
    const val CORRECT_ANSWERS :String = "correctAnswers"



    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(1,"What country does this flag belong to?", R.drawable.sa,"Argentina","India","South Africa","Nigeria",3)
        questionList.add(ques1)

        val ques2 = Question(1,"What country does this flag belong to?", R.drawable.india,"Algeria","India","South Africa","Morocco",2)
        questionList.add(ques2)

        val ques3 = Question(1,"What country does this flag belong to?", R.drawable.jamica,"Jamaica","Portugal","USA","Nigeria",1)

        questionList.add(ques3)

        val ques4 = Question(1,"What country does this flag belong to?", R.drawable.agerntina,"Argentina","USA","South Africa","Jamaica",1  )
        questionList.add(ques4)

        val ques5 = Question(1,"What country does this flag belong to?", R.drawable.usa,"USA","India","South Africa","Nigeria",1)
        questionList.add(ques5)

        val ques6 = Question(1,"What country does this flag belong to?", R.drawable.canada,"Canada","India","Lesotho","Nigeria",1)

        val ques7 = Question(1,"What country does this flag belong to?", R.drawable.germany,"Australia","Germany","Japan","Russia",2)


        val ques8= Question(1,"What country does this flag belong to?", R.drawable.russia,"Zanzibar","Germany","China","Russia",4)

        val ques9 = Question(1,"What country does this flag belong to?", R.drawable.iran,"Canada","India","Iran","Nigeria",3)
        val ques10 = Question(1,"What country does this flag belong to?", R.drawable.lesotho,"Iraq","Lesotho","South Africa","Nigeria",2)



        questionList.add(ques6)
     return questionList
    }


}
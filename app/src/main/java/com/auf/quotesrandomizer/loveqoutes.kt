package com.auf.quotesrandomizer

import android.content.Intent
import android.content.Intent.getIntent
import java.util.*
import kotlin.random.Random

class loveqoutes {

    companion object{


        private val lovesquotes = mapOf(
            Pair(1,"I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more. \n—Angelita Lim"),
            Pair(2,"You know you’re in love when you can’t fall asleep because reality is finally better than your dreams. \n—Dr. Seuss"),
            Pair(3,"Love is that condition in which the happiness of another person is essential to your own. \n—Robert A. Heinlein"),
            Pair(4,"The best thing to hold onto in life is each other. \n–Audrey Hepburn"),
            Pair(5,"I need you like a heart needs a beat. \n–Unknown"),
            Pair(6,"I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had. \n—The Notebook"),
            Pair(7,"If I had a flower for every time I thought of you... I could walk through my garden forever. \n—Alfred Tennyson"),
            Pair(8,"Take my hand, take my whole life too. For I can’t help falling in love with you. \n—Elvis Presley"),
            Pair(9,"If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you. \n–A. A. Milne"),
            Pair(10,"You’re the closest to heaven, that I’ll ever be. \n—Goo Goo Dolls")
        )





        fun getQuote(): String? {

            val numbers =  Random.nextInt(1,10)
            var a = lovesquotes.get(numbers)
            return a
        }




    }

}
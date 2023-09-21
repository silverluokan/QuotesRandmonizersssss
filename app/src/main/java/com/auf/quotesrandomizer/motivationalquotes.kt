package com.auf.quotesrandomizer

import kotlin.random.Random

class motivationalquotes {
    companion object{
        private val motivationalquotes = mapOf(
            Pair(1,"People often say that motivation doesn't last. Well, neither does bathing -- that's why we recommend it daily. \n-Zig Ziglar"),
            Pair(2,"If you don't take a risks, you can't create your future. \n-Monkey D. Luffy"),
            Pair(3,"If you're afraid to fail, then you're probably going to fail.  \n-Kobe Bryant"),
            Pair(4,"Your time is limited, so don't waste it living someone else's life. \n-Steve Jobs"),
            Pair(5,"Sales are contingent upon the attitude of the salesman -- not the attitude of the prospect. \n-W. Clement Stone"),
            Pair(6,"Everyone lives by selling something. \n-Robert Louis Stevenson"),
            Pair(7,"Be the best version of yourself in anything you do. You don't have to anybody else's story. -Stephen Curry"),
            Pair(8,"The golden rule for every businessman is this: Put yourself in your customer's place. \n-Orison Swett Marden"),
            Pair(9,"If you cannot do great things, do small things in a great way. \n-Napoleon Hill"),
            Pair(10,"The best leaders are those most interested in surrounding themselves with assistants and associates smarter than they are. They are frank in admitting this and are willing to pay for such talents. \n-Antos Parrish")
        )

        fun getQuotes(): String? {

            val numbers =  Random.nextInt(1,10)
            var a = motivationalquotes.get(numbers)
            return a
        }
    }
}
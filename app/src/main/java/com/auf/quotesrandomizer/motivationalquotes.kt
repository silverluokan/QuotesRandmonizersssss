package com.auf.quotesrandomizer

import kotlin.random.Random

class motivationalquotes {
    companion object{
        private val motivationalquotes = mapOf(
            Pair(1,"If you don't take a risks, you can't create your future. \n-Monkey D. Luffy"),
            Pair(2,"The moment you give up is the moment you let someone else win. \n-Roronoa Zoro"),
            Pair(3," The minute you think of giving up, think of the reason why you held on so long. \n-Nami"),
            Pair(4,"Your time is limited, so don't waste it living someone else's life. \n-Steve Jobs"),
            Pair(5,"Sales are contingent upon the attitude of the salesman -- not the attitude of the prospect. \n-W. Clement Stone"),
            Pair(6,"Everyone lives by selling something. \n-Robert Louis Stevenson"),
            Pair(7,"If you are not taking care of your customer, your competitor will. -Bob Hooey"),
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
package com.auf.quotesrandomizer

import kotlin.random.Random

class inspirationalquotes {
    companion object{

        private val inspirationalquotes = mapOf(
            Pair(1,"When you have a dream, you've got to grab it and never let go. \n-Carol Burnett"),
            Pair(2,"Nothing is impossible. The word itself says 'I'm possible!. \n— Audrey Hepburn"),
            Pair(3,"There is nothing impossible to they who will try. \n—Alexander the Great"),
            Pair(4,"The bad news is time flies. The good news is you're the pilot. \n–Michael Altshuler"),
            Pair(5,"Life has got all those twists and turns. You've got to hold on tight and off you go. \n–Nicole Kidman"),
            Pair(6,"Keep your face always toward the sunshine, and shadows will fall behind you. \n—Walt Whitman"),
            Pair(7,"Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell. \n—Amal Clooney"),
            Pair(8,"You make a choice: continue living your life feeling muddled in this abyss of self-misunderstanding, or you find your identity independent of it. You draw your own box. \n— Duchess Meghan"),
            Pair(9,"You define your own life. Don't let other people write your script. \n– Oprah Winfrey"),
            Pair(10,"Success is not final, failure is not fatal: it is the courage to continue that counts. \n—Winston Churchill")
        )

        fun getQuotess(): String? {

            val numbers =  Random.nextInt(1,10)
            var a = inspirationalquotes.get(numbers)
            return a
        }

    }
}
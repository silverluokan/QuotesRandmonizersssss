package com.auf.quotesrandomizer

import kotlin.random.Random

class allquotes {
    companion object{
        private val allquotes = mapOf(
            Pair(1,"I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more. \n—Angelita Lim"),
            Pair(2,"You know you’re in love when you can’t fall asleep because reality is finally better than your dreams. \n—Dr. Seuss"),
            Pair(3,"Love is that condition in which the happiness of another person is essential to your own. \n—Robert A. Heinlein"),
            Pair(4,"The best thing to hold onto in life is each other. \n–Audrey Hepburn"),
            Pair(5,"I need you like a heart needs a beat. \n–Unknown"),
            Pair(6,"I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had. \n—The Notebook"),
            Pair(7,"If I had a flower for every time I thought of you... I could walk through my garden forever. \n—Alfred Tennyson"),
            Pair(8,"Take my hand, take my whole life too. For I can’t help falling in love with you. \n—Elvis Presley"),
            Pair(9,"If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you. \n–A. A. Milne"),
            Pair(10,"You’re the closest to heaven, that I’ll ever be. \n—Goo Goo Dolls"),
            Pair(11,"When you have a dream, you've got to grab it and never let go. \n-Carol Burnett"),
            Pair(12,"Nothing is impossible. The word itself says 'I'm possible!. \n— Audrey Hepburn"),
            Pair(13,"There is nothing impossible to they who will try. \n—Alexander the Great"),
            Pair(14,"The bad news is time flies. The good news is you're the pilot. \n–Michael Altshuler"),
            Pair(15,"Life has got all those twists and turns. You've got to hold on tight and off you go. \n–Nicole Kidman"),
            Pair(16,"Keep your face always toward the sunshine, and shadows will fall behind you. \n—Walt Whitman"),
            Pair(17,"Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell. \n—Amal Clooney"),
            Pair(18,"You make a choice: continue living your life feeling muddled in this abyss of self-misunderstanding, or you find your identity independent of it. You draw your own box. \n— Duchess Meghan"),
            Pair(19,"You define your own life. Don't let other people write your script. \n– Oprah Winfrey"),
            Pair(20,"Success is not final, failure is not fatal: it is the courage to continue that counts. \n—Winston Churchill"),
            Pair(21,"People often say that motivation doesn't last. Well, neither does bathing -- that's why we recommend it daily. \n-Zig Ziglar"),
            Pair(22,"Someday is not a day of the week. \n-Denise Brennan-Nelson"),
            Pair(23,"Hire character. Train skill. \n-Peter Schutz"),
            Pair(24,"Your time is limited, so don't waste it living someone else's life. \n-Steve Jobs"),
            Pair(25,"Sales are contingent upon the attitude of the salesman -- not the attitude of the prospect. \n-W. Clement Stone"),
            Pair(26,"Everyone lives by selling something. \n-Robert Louis Stevenson"),
            Pair(27,"If you are not taking care of your customer, your competitor will. \n-Bob Hooey"),
            Pair(28,"The golden rule for every businessman is this: Put yourself in your customer's place. \n-Orison Swett Marden"),
            Pair(29,"If you cannot do great things, do small things in a great way. \n-Napoleon Hill"),
            Pair(30,"The best leaders are those most interested in surrounding themselves with assistants and associates smarter than they are. They are frank in admitting this and are willing to pay for such talents. \n-Antos Parrish")
        )

        fun getQuotesss(): String? {

            val numbers =  Random.nextInt(1,10)
            var a = allquotes.get(numbers)
            return a
        }
    }
}
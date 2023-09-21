package com.auf.quotesrandomizer

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.auf.quotesrandomizer.databinding.ActivityGetRandomQuotesBinding
import java.text.SimpleDateFormat
import java.util.*


class QuoteRandomActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityGetRandomQuotesBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetRandomQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = getIntent()

        supportActionBar?.hide()

        sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

        var whatQuote = intent.getExtras()?.getString("Quotess");
        binding.textView3.text = whatQuote

        binding.randomizer.setOnClickListener(this)
        binding.btnfav.setOnClickListener(this)
        if(whatQuote == "Love"){
            val lovequotess = loveqoutes.getQuote()
            binding.textView3.text = lovequotess
        }
        else if(whatQuote == "Motivational"){
            val lovequotess = motivationalquotes.getQuotes()
            binding.textView3.text = lovequotess
        }
        else if(whatQuote == "Inspirational"){
            val lovequotess = inspirationalquotes.getQuotess()
            binding.textView3.text = lovequotess
        }

    }
    fun time(): String{
        val simpleDate = SimpleDateFormat("hh:mm:ss")
        val currentDate = simpleDate.format(Date())
        var timedate = "\n Timestamp : $currentDate"
        return timedate
    }
    override fun onClick(p0: View?) {
        val intent = getIntent()
        var whatQuote = intent.getExtras()?.getString("Quotess");
        when(p0!!.id){
            (R.id.randomizer)->{
                if(whatQuote == "Love"){
                    val lovequotess = loveqoutes.getQuote()
                    binding.textView3.text = lovequotess
                }
                else if(whatQuote == "Motivational"){
                    val lovequotess = motivationalquotes.getQuotes()
                    binding.textView3.text = lovequotess
                }
                else if(whatQuote == "Inspirational"){
                    val lovequotess = inspirationalquotes.getQuotess()
                    binding.textView3.text = lovequotess
                }
            }
            (R.id.btnfav)->{
                val editor = sharedPreferences.edit()
                editor.putString(FAVQUOTE, binding.textView3.text.toString()+time())
                editor.apply()
                var t = Toast.makeText(applicationContext, "Succesfully Added", Toast.LENGTH_SHORT)
                t.show()
            }
        }
    }
}
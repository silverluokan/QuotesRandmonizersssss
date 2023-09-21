package com.auf.quotesrandomizer

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.auf.quotesrandomizer.databinding.ActivityMainBinding

class GetRandomQuotes : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var favquotes = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        validateButton()
        sharedPreferences = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

        supportActionBar?.hide()

        binding.btnLoveQuote.setOnClickListener(this)
        binding.btnInspirational.setOnClickListener(this)
        binding.btnMotivational.setOnClickListener(this)
        binding.btnViewFav.setOnClickListener(this)
        favquotes = sharedPreferences.getString(FAVQUOTE, "").toString()
        val lovequotess = allquotes.getQuotesss()
        binding.textView2.text = lovequotess
    }

    override fun onStart() {
        super.onStart()
        favquotes = sharedPreferences.getString(FAVQUOTE, "").toString()
        validateButton()
    }

    private fun validateButton() {

        binding.btnViewFav.isEnabled = favquotes != ""
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            (R.id.btnLoveQuote)->{
                var loves = "Love"
                var intent = Intent(this,QuoteRandomActivity::class.java)
                intent.putExtra("Quotess",loves)

                startActivity(intent)
            }
            (R.id.btnInspirational)->{
                var loves = "Inspirational"
                var intent = Intent(this,QuoteRandomActivity::class.java)
                intent.putExtra("Quotess",loves)
                startActivity(intent)
            }
            (R.id.btnMotivational)->{
                var loves = "Motivational"
                var intent = Intent(this,QuoteRandomActivity::class.java)
                intent.putExtra("Quotess",loves)
                startActivity(intent)
            }
            (R.id.btnViewFav)->{
                var intent = Intent(this, MYFAV::class.java)
                startActivity(intent)
            }
        }
    }
}
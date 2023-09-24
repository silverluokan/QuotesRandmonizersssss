package com.auf.quotesrandomizer

import android.content.Context
import android.content.SharedPreferences
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.auf.quotesrandomizer.databinding.ActivityGetRandomQuotesBinding
import com.auf.quotesrandomizer.databinding.ActivityMyfavBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MYFAV : AppCompatActivity(), View.OnClickListener{
    private lateinit var binding: ActivityMyfavBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyfavBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.remfav.setOnClickListener(this)
        sharedPreferences  = getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

        val showFaveQuote = sharedPreferences.getString(FAVQUOTE, "")
        val showFaveQuoteTimeStamp = sharedPreferences.getLong(FAVQUOTE_TIME, 0)

        //Convert millis to Date()
        val formattedDateTime = SimpleDateFormat("MM/dd/yyyy - hh:mm:ss", Locale.getDefault())
            .format(Date(showFaveQuoteTimeStamp))

        binding.textView4.text = "Favorite Quote\n$showFaveQuote\n$formattedDateTime"
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            (R.id.remfav)->{
                sharedPreferences.edit().clear().apply()
                var t = Toast.makeText(applicationContext, "Succesfully Deleted", Toast.LENGTH_SHORT)
                t.show()
                finish()
            }
        }
    }
}
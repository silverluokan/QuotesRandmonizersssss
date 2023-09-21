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

        binding.textView4.text = String.format("%s", sharedPreferences.getString(
            FAVQUOTE,""))
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
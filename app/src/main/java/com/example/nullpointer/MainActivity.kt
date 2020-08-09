package com.example.nullpointer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zahl : Int? = null
        val wort : String = ""

        val zahlNull : Int? = null
        if(zahlNull == null) Log.i("Test", "zahlnull hat den Wert $zahlNull")
        else Log.i("Test", "Zahlnull ist nicht null.")

        val text = "ABC"
        Log.i("Test","Der String text ist ${text.length} Zeichen lang.")

        val textNull : String? = null
        try {
            Log.i("Test","Der String textNull ist ${textNull!!.length} Zeichen lang.")
        } catch (e : KotlinNullPointerException){
            Log.i("Test", "FEHLER")
        }
    }
}
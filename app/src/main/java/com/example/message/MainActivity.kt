package com.example.message

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {

    var boton : Button ?= null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.boton1).setOnClickListener{
            addMensaje(it)
        }
    }

    private fun addMensaje(view: View){
        val editText=findViewById<EditText>(R.id.editTextTextPersonName)
        val mensajeTextView=findViewById<TextView>(R.id.textView)

        mensajeTextView.text=editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE

        mensajeTextView.visibility=View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }

}
package com.example.calculatorkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var calculator = Calculator_Class(true, "", "+")

    fun numAction(view: View) {
        calculator.numMethod(findViewById<EditText>(R.id.editText), view)
    }

    fun operAction(view: View) {
        calculator.operatorMethod(findViewById<EditText>(R.id.editText).text.toString(), view)
    }

    fun eqAction(view: View) {
        calculator.equalMethod(findViewById<EditText>(R.id.editText).text.toString(), findViewById<EditText>(R.id.editText), view)
    }

    fun acEvent(view: View) {
        calculator.acClearMethod(findViewById<EditText>(R.id.editText), view)
    }

    fun percentAction(view: View) {
        calculator.percentEventMethod(findViewById<EditText>(R.id.editText).text.toString(), findViewById<EditText>(R.id.editText), view)
    }
}
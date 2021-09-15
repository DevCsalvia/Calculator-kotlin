package com.example.calculatorkotlinapp

import android.widget.Button
import android.widget.EditText
import android.view.View


class Calculator_Class(var isNewOp: Boolean, var oldNumber: String, var op: String) {

    fun numMethod (editText: EditText, view: View) {
        if(isNewOp)
            editText.setText("")
        isNewOp = false
        var buclick:String = editText.text.toString()
        var buselect: Button = view as Button
        if (buselect.id == R.id.bu1)
        {
            buclick += "1"
        } else if (buselect.id == R.id.bu2) {
            buclick += "2"
        } else if (buselect.id == R.id.bu3) {
            buclick += "3"
        } else if (buselect.id == R.id.bu4) {
            buclick += "4"
        } else if (buselect.id == R.id.bu5) {
            buclick += "5"
        } else if (buselect.id == R.id.bu6) {
            buclick += "6"
        } else if (buselect.id == R.id.bu7) {
            buclick += "7"
        } else if (buselect.id == R.id.bu8) {
            buclick += "8"
        } else if (buselect.id == R.id.bu9) {
            buclick += "9"
        } else if (buselect.id == R.id.bu0) {
            buclick += "0"
        } else if (buselect.id == R.id.buDot) {
            buclick += "."
        } else if (buselect.id == R.id.buPlusMinus) {
            buclick = "-$buclick"
        }
        editText.setText(buclick)
    }

    fun operatorMethod (firstNumber: String,  view: View) {
        isNewOp = true
        oldNumber = firstNumber
        var buselect:Button = view as Button
        if (buselect.id == R.id.buMultiply) {
            op = "*"
        } else if(buselect.id == R.id.buPlus) {
            op = "+"
        } else if(buselect.id == R.id.buMinus) {
            op = "-"
        } else if(buselect.id == R.id.buDivide) {
            op = "/"
        }
    }

    fun equalMethod (inNumber: String, edText: EditText, view: View) {
        var newNumber:Double = inNumber.toDouble()
        var result = 0.0
        if(op == "+") {
            result = oldNumber.toDouble() + newNumber
        } else if(op == "*") {
            result = oldNumber.toDouble() * newNumber
        } else if(op == "/") {
            result = oldNumber.toDouble() / newNumber
        } else if(op == "-") {
            result = oldNumber.toDouble() - newNumber
        }
        edText.setText(result.toString())
    }

    fun acClearMethod(edText: EditText, view: View) {
        edText.setText("0")
        isNewOp = true
    }

    fun percentEventMethod(num:String, edText: EditText, view: View) {
        isNewOp = true
        var no: Double = num.toDouble() / 100
        edText.setText(no.toString())
    }
}
package com.suhun.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AlertDialog
import java.util.Random

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "secretNumber" + secretNumber.secret_number)
    }

    fun check(view: View){
        val user_input:Int = ed_number.text.toString().toInt()
        val msg:String = secretNumber.verifyNumber(user_input) + "你共猜了" + secretNumber.count + "次"
        Log.d("MainActivity", "count：" + secretNumber.count)
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(msg)
            .setPositiveButton("ok", null)
            .show()
    }
}

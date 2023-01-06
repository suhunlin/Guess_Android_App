package com.suhun.guess

import java.util.Random

class SecretNumber {
    val secret_number = Random().nextInt(100) + 1
    var count = 0

    fun verifyNumber(number:Int):String{
        count ++
        if(secret_number - number > 0)
        {
            return "請輸入大一點的數字!"
        }
        else if(secret_number - number < 0)
        {
            return "請輸入小一點的數字!"
        }
        else
        {
            return "你答對了!"
        }
    }
}
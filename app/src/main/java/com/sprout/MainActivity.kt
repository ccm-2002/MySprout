package com.sprout

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.annotations.NonNull

class MainActivity : AppCompatActivity() {

    var count = 0

    private val handler: Handler = object : Handler() {
        override fun handleMessage(@NonNull msg: Message) {
            if (msg.what === 1) {
                count++
                if (count==5){
                    val intent = Intent(this@MainActivity,SproutActivity::class.java)
                    startActivity(intent)
                }else{
                    sendEmptyMessageDelayed(1,1000)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler.sendEmptyMessageDelayed(1,1000)
    }


}
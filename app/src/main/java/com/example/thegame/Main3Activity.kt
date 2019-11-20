package com.example.thegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

    }
}

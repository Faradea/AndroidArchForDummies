package com.example.intentbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startSecondActivity()
    }

    private fun startSecondActivity() {
        startActivity(
            SecondActivity.IntentBuilder()
                .param1("value1")
                .param2(true)
                .build(this)
        )

        // or you can use start()
        /*
        SecondActivity.IntentBuilder()
            .param1("value1")
            .param2(true)
            .start(this)
        */
    }
}

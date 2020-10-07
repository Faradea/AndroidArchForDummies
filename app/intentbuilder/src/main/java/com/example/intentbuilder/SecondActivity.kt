package com.example.intentbuilder

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KEY1 = "key1"
        const val EXTRA_KEY2 = "key2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    class IntentBuilder {
        private var param1: String? = null
        private var param2: Boolean? = null

        fun param1(param1: String?) = apply { this.param1 = param1 }
        fun param2(param2: Boolean?) = apply { this.param2 = param2 }

        fun build(context: Context): Intent =
            Intent(context, SecondActivity::class.java)
                .putExtra(EXTRA_KEY1, param1)
                .putExtra(EXTRA_KEY2, param2)

        fun start(context: Context) {
            context.startActivity(this.build(context))
        }
    }
}
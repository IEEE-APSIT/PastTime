package com.example.pasttime

//import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import it.beppi.knoblibrary.Knob


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val knob = findViewById(R.id.knob) as Knob
        knob.state = 1
        knob.setOnStateChanged {
            // do something
        }
    }
}

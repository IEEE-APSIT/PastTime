package com.example.pasttime

//import android.R
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import it.beppi.knoblibrary.Knob
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val knob = findViewById<Knob>(R.id.knob)
        val knobVal = findViewById<TextView>(R.id.knobValue)
        knob.state = 1
        knob.setOnStateChanged {
            counter = 99-knob.state
            knobVal.text = (99-knob.state).toString()
            // do something
        }
    }

    fun startTimeCounter(view: View) {
        object : CountDownTimer((counter*1000).toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                knob.state++
                knobValue.text = (99-knob.state).toString()
            }
            override fun onFinish() {
                knobValue.text = "Finished"
            }
        }.start()
    }
}

package com.example.kalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CalendarView = findViewById<CalendarView>(R.id.calendar1)
        val progressBar =  findViewById<ProgressBar>(R.id.progressBar)
        val seekBar =  findViewById<SeekBar>(R.id.seekBar)
        val textView = findViewById<TextView>(R.id.text1)

        seekBar.setOnSeekBarChangeListener(new Seekbar.OnSeekBarChangeListener()){
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser){
                progressBar.setProgress(progress);
                textView.setText(" "+ progress+ " %")
            }
            public void onStartTrackingTouch(SeekBar seekbar){

            }
        }
    }
}
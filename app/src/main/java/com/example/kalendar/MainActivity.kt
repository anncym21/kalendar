package com.example.kalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Long min = c.getTime().getTime()
        Long max = 21772800L + c.gettime().getTime()
        CalendarView calendar1 = (CalendarView) findViewById(R.id.calendar1)
        calendar1.setMinDate(min)
        calendar1.setMaxdate(max)
        calendarView calendar2  (CalendarView) findViewById(R.id.calendar2)

        progressBar = (Progressbar) findViewById(R.id.progressBar)
        seekBar = (Seekbar) findViewById(R.id.seekBar)
        textView = (TextView) findViewById(R.id.text1)

        seekBar.setOnSeekBarChangeListener(new Seekbar.OnSeekBarChangeListener()){
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser){
                progressBar.setProgress(progress);
                textView.setText(" "+ progress+ "%")
            }
            public void onStartTrackingTouch(SeekBar seekbar){

            }
        }
    }
}
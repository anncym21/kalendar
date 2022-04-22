package com.example.kalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
        if(calendar1<calendar2){

        }
    }
}
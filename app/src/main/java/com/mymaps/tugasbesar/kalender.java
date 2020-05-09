package com.mymaps.tugasbesar;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class kalender extends AppCompatActivity {
    CalendarView calendarView ;
    TextView dateView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalender);
        calendarView = findViewById(R.id.kalender);
        dateView = findViewById(R.id.dateView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String Date = dayOfMonth + "-" + (month +1) + "-" + year;
                dateView.setText(Date);
            }
        });
    }
}

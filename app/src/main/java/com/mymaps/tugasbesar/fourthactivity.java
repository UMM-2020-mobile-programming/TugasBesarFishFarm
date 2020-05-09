package com.mymaps.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class fourthactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudua);
    }

    public void kalender(View view) {
        Intent intent = new Intent(fourthactivity.this, kalender.class);
        startActivity(intent);
    }

    public void stat(View view) {
        Intent intent = new Intent(fourthactivity.this,statistik.class);
        startActivity(intent);
    }

    public void laporan(View view) {
        Intent intent = new Intent(fourthactivity.this, laporan.class);
        startActivity(intent);
    }

    public void setting(View view) {
        Intent intent = new Intent(fourthactivity.this, SettingsActivity.class);
        startActivity(intent);
    }
}

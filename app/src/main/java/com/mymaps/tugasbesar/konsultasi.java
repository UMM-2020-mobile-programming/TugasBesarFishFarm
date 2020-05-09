package com.mymaps.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class konsultasi extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konsultasi);
    }

    public void submit4(View view) {
        Intent intent = new Intent(konsultasi.this, thirdactivity.class);
        startActivity(intent);
    }
}

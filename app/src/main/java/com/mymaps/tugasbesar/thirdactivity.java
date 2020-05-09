package com.mymaps.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class thirdactivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }

    public void pilihan1(View view) {
        Intent intent = new Intent(thirdactivity.this,bibit.class);
        startActivity(intent);
    }

    public void pilihan2(View view) {
        Intent intent = new Intent(thirdactivity.this, pakan.class);
        startActivity(intent);
    }

    public void btnNext(View view) {
        Intent intent = new Intent(thirdactivity.this,fourthactivity.class);
        startActivity(intent);
    }

    public void pilihan4(View view) {
        Intent intent = new Intent(thirdactivity.this, konsultasi.class);
        startActivity(intent);
    }

    public void pilihan3(View view) {
        Intent intent = new Intent(thirdactivity.this, harian.class);
        startActivity(intent);
    }
}


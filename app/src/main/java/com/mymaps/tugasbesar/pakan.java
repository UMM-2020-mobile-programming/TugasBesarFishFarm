package com.mymaps.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pakan extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pakan);
    }

    public void submit2(View view) {
        Intent intent = new Intent(pakan.this,thirdactivity.class);
        startActivity(intent);
    }
}

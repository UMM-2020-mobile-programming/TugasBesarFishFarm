package com.mymaps.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bibit extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bibit);

    }

    public void submit(View view) {
        Intent intent = new Intent(bibit.this, thirdactivity.class);
        startActivity(intent);
    }


}


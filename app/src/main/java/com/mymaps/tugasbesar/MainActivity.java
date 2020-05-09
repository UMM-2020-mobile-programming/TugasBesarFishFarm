package com.mymaps.tugasbesar;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText User,Passw;
Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User = (EditText)findViewById(R.id.email);
        Passw = (EditText)findViewById(R.id.pw);
        btn_login = (Button)findViewById(R.id.btn_login);

     btn_login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(getApplicationContext(),thirdactivity.class);
        if (User.getText().toString().equals("tanthowi")&& Passw.getText().toString().equals("qwerty")){
            Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_SHORT).show();
            intent.putExtra("Username",User.getText().toString());
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"Username atau Password Salah",Toast.LENGTH_SHORT).show();
        }
         }
     });
    }

    public void daftar(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void lupa(View view) {
        Intent intent =new Intent(MainActivity.this,lupapas.class);
        startActivity(intent);
    }
}

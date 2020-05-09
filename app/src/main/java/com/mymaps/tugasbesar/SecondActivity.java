package com.mymaps.tugasbesar;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText username, fullname, email2, pw2;
    Button btn_login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        username = (EditText) findViewById(R.id.username);
        fullname = (EditText) findViewById(R.id.fullname);
        email2 = (EditText) findViewById(R.id.email2);
        pw2 = (EditText) findViewById(R.id.pw2);
        btn_login2 = (Button) findViewById(R.id.btn_login2);
        btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), thirdactivity.class);
                if (username.length()==0 && pw2.length()==0 && fullname.length()==0 && email2.length()==0){
                    pw2.setError("Data Harus Diinputkan");
                    username.setError("Data Harus Diinputkan");
                    fullname.setError("Data Harus Diinputkan");
                    email2.setError("Data Harus Diinputkan");
                }
                     else{
                    startActivity(intent);
                }
                    ;
                }
        });
    }
}
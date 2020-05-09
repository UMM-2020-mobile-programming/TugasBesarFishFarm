package com.mymaps.tugasbesar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class lupapas extends AppCompatActivity {
    EditText lupaemail;
    Button lupapas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lupapas);
        lupaemail = (EditText) (findViewById(R.id.lupaemail));
        lupapas = (Button) (findViewById(R.id.lupapas));

        lupapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                if (lupaemail.length()==0){
                    lupaemail.setError("Harap Isi E-Mail");
                }
                else {
                    Toast.makeText(getApplicationContext(),"Silahkan Buka Link Yang Terdapat Pada Email Anda",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });

    }
}

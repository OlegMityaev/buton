package com.example.buton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity{

    EditText pass, mail;
    Button reg,sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pass = findViewById(R.id.pass);
        mail = findViewById(R.id.mail);
        reg = findViewById(R.id.reg);
        sign = findViewById(R.id.sign);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent password;
                Intent email;
                Intent d;
                Intent e;
                switch(v.getId()) {
                    case R.id.sign:
                        d = new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(d); // работает
                        break;
                    case R.id.reg:
                        email = new Intent(MainActivity2.this, MainActivity.class);
                        String eText = mail.getText().toString();
                        email.putExtra("et", eText);
                        startActivity(email);
                        password = new Intent(MainActivity2.this, MainActivity.class);
                        String aText = pass.getText().toString();
                        password.putExtra("ex", aText);
                        startActivity(password);
                        e = new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(e);
                        break;
                    default:
                }
            }
        };
        reg.setOnClickListener(listener);
        sign.setOnClickListener(listener);
    }


}


package com.example.buton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //объявляем переменные для компонент (виджетов)
    TextView txt;
    EditText etxt2, etxt;
    Button bt1,bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализируем переменные объектами связанными с ID виджетов
        txt = findViewById(R.id.txt1);
        etxt = findViewById(R.id.editText2);
        etxt2 = findViewById(R.id.editText3);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

        //создаем обработчик
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i;
                String email = getIntent().getStringExtra("et");
                String password = getIntent().getStringExtra("ex");
                switch(v.getId()) {
                    case R.id.bt2:
                        i = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(i); // не работает
                        break;
                    case R.id.bt1:
                        if (etxt2.getText().toString().equals(email) & etxt.getText().toString().equals(password)) {
                            txt.setTextColor(Color.GREEN);
                            txt.setText("Верно");
                        } else {
                            txt.setTextColor(Color.RED);
                            txt.setText("Вы ошиблись в логине или пароле");
                        }
                        break;
                    default:
                }
            }
        };
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
    }


    // декларативно заданный обработчик (атрибут onClick)
    public void quit(View view){
        finish();
    }


}
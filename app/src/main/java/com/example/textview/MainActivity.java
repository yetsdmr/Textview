package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        goster("Emre");
    }

    private void tanimla(){
        txt = (TextView) findViewById(R.id.text1);
    }
    private void goster(String kullaniciAdi){
        txt.setText(kullaniciAdi);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Toast.makeText(getApplicationContext(),"Other activity started",Toast.LENGTH_LONG).show();
        Bundle arguments =getIntent().getExtras();
        String data = arguments.get("KEY_NAME").toString();
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();
    }
}

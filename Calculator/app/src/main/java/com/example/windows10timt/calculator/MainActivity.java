package com.example.windows10timt.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int a = 0, b = 0, count = 0;
    double r = 0;
    ArrayList num;
    String resulst;
    int opreator = 0;
    Button AC, one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multi, divide, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

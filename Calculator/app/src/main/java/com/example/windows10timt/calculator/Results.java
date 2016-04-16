package com.example.windows10timt.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class Results extends AppCompatActivity {
    Button back;
    String r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = this.getIntent();
        this.r = intent.getStringExtra(r);
        TextView textView = (TextView) findViewById(R.id.results);
        textView.setText(r);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id) {
                    case R.id.backbtn:
                        Toast.makeText(Results.this, "Back", Toast.LENGTH_SHORT).show();
                        finish();
                }
            }
        };
        back = (Button) findViewById(R.id.backbtn);
        back.setOnClickListener(click);
    }
}

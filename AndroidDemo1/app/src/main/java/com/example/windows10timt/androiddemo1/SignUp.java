package com.example.windows10timt.androiddemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private String name, pass;
    Button back, show;
    TextView userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Intent intentx = this.getIntent();

        this.name = intentx.getStringExtra("x");
        this.pass = intentx.getStringExtra("y");

        userName= (TextView) findViewById(R.id.signInuserName);
        password= (TextView) findViewById(R.id.signInpassword);
        userName.setText(name);
        password.setText(pass);


        back = (Button) findViewById(R.id.backBtn);
        show = (Button) findViewById(R.id.showBtn);

        View.OnClickListener clickBack = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int id = v.getId();
                switch (id) {
                    case R.id.backBtn:
                        finish();
                        break;
                    case R.id.showBtn:
                        finish();
                        break;
                }*/
                finish();
            }
        };
        View.OnClickListener clickShow = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName.setText(name);
                password.setText(pass);
                Toast.makeText(SignUp.this, "Show", Toast.LENGTH_SHORT).show();
            }
        };
        back.setOnClickListener(clickBack);
        show.setOnClickListener(clickShow);


    }

}

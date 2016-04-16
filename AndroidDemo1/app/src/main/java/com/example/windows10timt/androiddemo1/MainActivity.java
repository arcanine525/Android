package com.example.windows10timt.androiddemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText passwordEdt, userNameEdt;
    private Button logInBtn, signUpBtn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwordEdt = (EditText) findViewById(R.id.password);
        userNameEdt = (EditText) findViewById(R.id.userName);
        logInBtn = (Button) findViewById(R.id.logInBtn);
        signUpBtn = (Button) findViewById(R.id.signUpBtn);
        text = (TextView) findViewById(R.id.text123);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String userName = userNameEdt.getText().toString();
                String password = passwordEdt.getText().toString();
                switch (id) {
                    case R.id.signUpBtn:
                        Toast.makeText(MainActivity.this, "Sign Up", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, SignUp.class);
                        intent.putExtra("x", userName);
                        intent.putExtra("y", password);
                        startActivity(intent);
                        break;
                    case R.id.logInBtn:
                        if (password.equals("a")) {
                            Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                        }
                        text.setText(userName + password);
                        break;
                }
            }
        };

        logInBtn.setOnClickListener(click);
        signUpBtn.setOnClickListener(click);
    }
}

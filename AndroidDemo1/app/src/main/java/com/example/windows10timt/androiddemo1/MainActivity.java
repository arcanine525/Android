package com.example.windows10timt.androiddemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText password, userName;
    Button logInBtn, signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = (EditText) findViewById(R.id.password);
        userName = (EditText) findViewById(R.id.userName);
        logInBtn = (Button) findViewById(R.id.logInBtn);
        signUpBtn = (Button) findViewById(R.id.signUpBtn);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String name=userName.getText().toString();
                String pass=password.getText().toString();

                switch (id){
                    case R.id.logInBtn:
                        Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.signUpBtn:
                        Toast.makeText(MainActivity.this, "Sign Up", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        };


    }
}

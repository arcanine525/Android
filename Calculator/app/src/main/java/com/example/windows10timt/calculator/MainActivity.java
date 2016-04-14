package com.example.windows10timt.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int a = 0, b = 0;
    double r = 0;
    String x, y;
    int opreator=0;
    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multi, divide, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String strA = a + x;
                String strB = b + x;
                boolean isDot=false;
                switch (id) {
                    case R.id.AC:
                        a = b = 0;
                        r = 0;
                        opreator = 0;
                        break;
                    case R.id.plus:
                        opreator=1;
                        isDot=false;
                        break;
                    case R.id.minus:
                        opreator=2;
                        isDot=false;
                        break;
                    case R.id.multi:
                        opreator=3;
                        isDot=false;
                        break;
                    case R.id.divide:
                        opreator=4;
                        isDot=false;
                        break;
                    case R.id.equal:
                        opreator=5;
                        isDot=false;
                        break;
                    case R.id.dot:
                        isDot=true;
                        break;
                    case R.id.one:
                        if(isDot=true){

                        }



                }

            }
        };
    }
private double inputNumber(double num,boolean isDot,int inputNum){
    if(isDot==false){
        return num*10+inputNum;
    }
    else return num+inputNum/10;

}

}

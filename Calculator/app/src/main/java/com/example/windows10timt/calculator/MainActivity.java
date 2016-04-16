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
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                boolean isDot = false;
                switch (id) {
                    case R.id.AC:
                        count = 0;
                        a = b = 0;
                        r = 0;
                        opreator = 0;
                        break;
                    case R.id.plus:
                        opreator = 1;
                        isDot = false;
                        break;
                    case R.id.minus:
                        opreator = 2;
                        isDot = false;
                        break;
                    case R.id.multi:
                        opreator = 3;
                        isDot = false;
                        break;
                    case R.id.divide:
                        opreator = 4;
                        isDot = false;
                        break;
                   /* case R.id.equal:
                        opreator = 5;
                        isDot = false;
                        break;*/
                    case R.id.dot:
                        isDot = true;
                        num.add(count, ",");
                        break;
                    case R.id.one:
                        num.add(count, 1);
                        count++;
                        Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT);
                        break;
                    case R.id.two:
                        num.add(count, 2);
                        count++;
                        Toast.makeText(MainActivity.this, "two", Toast.LENGTH_SHORT);
                        break;
                    case R.id.three:
                        num.add(count, 3);
                        count++;
                        Toast.makeText(MainActivity.this, "three", Toast.LENGTH_SHORT);
                        break;
                    case R.id.four:
                        num.add(count, 4);
                        Toast.makeText(MainActivity.this, "four", Toast.LENGTH_SHORT);
                        count++;
                        break;
                    case R.id.five:
                        num.add(count, 5);
                        Toast.makeText(MainActivity.this, "five", Toast.LENGTH_SHORT);
                        count++;
                        break;
                    case R.id.six:
                        num.add(count, 6);
                        count++;
                        Toast.makeText(MainActivity.this, "six", Toast.LENGTH_SHORT);
                        break;
                    case R.id.seven:
                        num.add(count, 7);
                        count++;
                        Toast.makeText(MainActivity.this, "seven", Toast.LENGTH_SHORT);
                        break;
                    case R.id.eight:
                        num.add(count, 8);
                        count++;
                        Toast.makeText(MainActivity.this, "eight", Toast.LENGTH_SHORT);
                        break;
                    case R.id.nine:
                        num.add(count, 9);
                        count++;
                        Toast.makeText(MainActivity.this, "nine", Toast.LENGTH_SHORT);
                        break;
                    case R.id.zero:
                        num.add(count, 0);
                        count++;
                        Toast.makeText(MainActivity.this, "zero", Toast.LENGTH_SHORT);
                        break;
                    case R.id.equal:
                        for (int i = 0; i < num.size(); i++) {
                            resulst = resulst + num.get(i);
                        }
                        Toast.makeText(MainActivity.this, "====", Toast.LENGTH_SHORT);
                        resultsMenu();
                }

            }
        };
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.equal);
        multi = (Button) findViewById(R.id.multi);
        divide = (Button) findViewById(R.id.divide);
        equal = (Button) findViewById(R.id.equal);
        AC = (Button) findViewById(R.id.AC);

        equal.setOnClickListener(click);
        AC.setOnClickListener(click);
        divide.setOnClickListener(click);
        multi.setOnClickListener(click);
        minus.setOnClickListener(click);
        plus.setOnClickListener(click);
        one.setOnClickListener(click);
        two.setOnClickListener(click);
        three.setOnClickListener(click);
        four.setOnClickListener(click);
        five.setOnClickListener(click);
        six.setOnClickListener(click);
        seven.setOnClickListener(click);
        eight.setOnClickListener(click);
        nine.setOnClickListener(click);
        zero.setOnClickListener(click);

    }

    /*private double inputNumber(double num, boolean isDot, int inputNum) {
        if (isDot == false) {
            return num * 10 + inputNum;
        } else return num + inputNum / 10;

    }*/

    private void resultsMenu() {
        Intent intent = new Intent(this, Results.class);
        intent.putExtra("r", resulst);
        startActivity(intent);
    }
}

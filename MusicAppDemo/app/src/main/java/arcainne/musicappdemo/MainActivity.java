package arcainne.musicappdemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /* TextView textView;
     Typeface font;*/
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*textView = (TextView) findViewById(R.id.welcomeTitle);
        font = Typeface.createFromAsset(getAssets(), "font/IndieFlower.ttf");
        textView.setTypeface(font);*/
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MusicScreen.class);
                startActivity(intent);
            }
        };
        button= (Button) findViewById(R.id.welcome);
        button.setOnClickListener(click);
    }
}

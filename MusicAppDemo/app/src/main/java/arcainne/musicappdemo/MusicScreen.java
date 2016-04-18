package arcainne.musicappdemo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicScreen extends AppCompatActivity {
    Button playbtn, pausebtn;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_screen);
        Intent intent = this.getIntent();
        playbtn = (Button) findViewById(R.id.play);
        pausebtn = (Button) findViewById(R.id.pause);
        player = MediaPlayer.create(MusicScreen.this, R.raw.dedanhchoanhhq);
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id;
                id = v.getId();
                int duration = player.getDuration();
                int curr = player.getCurrentPosition();
                switch (id) {
                    case R.id.play:
                        if (curr >= 0) {
                            player.start();
                        } else if (curr == duration) {
                            player.reset();
                        }
                        playbtn.setEnabled(false);
                        pausebtn.setEnabled(true);
                        break;
                    case R.id.pause:
                        player.pause();
                        pausebtn.setEnabled(false);
                        playbtn.setEnabled(true);
                }
            }
        };
        playbtn.setOnClickListener(click);
        pausebtn.setOnClickListener(click);
    }
}

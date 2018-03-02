package testalot.com.hitscanapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.androidjson.firebasegooglelogin_androidjsoncom.R;

public class ScannerActivity extends AppCompatActivity {
    Context context = this;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        mp = MediaPlayer.create(context, R.raw.scanbutton_sound);
        @SuppressLint("WrongViewCast") final ImageButton b = (ImageButton) findViewById(R.id.scan_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(context, R.raw.scanbutton_sound);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
    }
}

package com.rid.ridofficial;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    ImageView image;
    Timer timer;
    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        image = findViewById(R.id.imageView);
        version = findViewById(R.id.textView2);

        timer = new Timer();


        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            String ver = pInfo.versionName;

            version.setText("Version " + ver);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash.this , Login.class);
                startActivity(intent);
                finish();

            }
        } , 1500);



    }
}

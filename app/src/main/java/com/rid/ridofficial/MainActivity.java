package com.rid.ridofficial;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawer;
    LinearLayout upc , ong , res , sqa;
    TextView upctext , ongtext , restext , sqatext;
    ImageButton upcimage , ongimage , resimage , sqaimage , rid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upc = findViewById(R.id.linearLayout2);
        ong = findViewById(R.id.linearLayout);
        res = findViewById(R.id.linearLayout3);
        sqa = findViewById(R.id.linearLayout4);
        rid = findViewById(R.id.imageButton);

        upctext = findViewById(R.id.upctext);
        ongtext = findViewById(R.id.ongtext);
        restext = findViewById(R.id.restext);
        sqatext = findViewById(R.id.sqatext);

        upcimage = findViewById(R.id.upcimage);
        ongimage = findViewById(R.id.ongimage);
        resimage = findViewById(R.id.resimage);
        sqaimage = findViewById(R.id.sqaimage);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayShowTitleEnabled(false);



        drawer = findViewById(R.id.container);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        toolbar.setTitle("RID Official");
        //toolbar.setSubtitle("red is dead");

        toolbar.setSubtitleTextColor(Color.WHITE);


        upcimage.setImageResource(R.drawable.ic_pubg);
        ongimage.setImageResource(R.drawable.ic_gamepad_controller2);
        resimage.setImageResource(R.drawable.ic_rank2);
        sqaimage.setImageResource(R.drawable.ic_multiplayer2);


        upctext.setTextColor(Color.parseColor("#ffffff"));
        ongtext.setTextColor(Color.parseColor("#ababab"));
        restext.setTextColor(Color.parseColor("#ababab"));
        sqatext.setTextColor(Color.parseColor("#ababab"));

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate();
        }

        Upcoming frag1 = new Upcoming();
        //frag1.setHomeActivity(HomeActivity.this);
        ft.replace(R.id.replace, frag1);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft.commit();

        rid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.youtube.com/channel/UC-u23g1hfCW5bj62KfqP1Iw";

                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }

            }
        });


        upc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                upcimage.setImageResource(R.drawable.ic_pubg);
                ongimage.setImageResource(R.drawable.ic_gamepad_controller2);
                resimage.setImageResource(R.drawable.ic_rank2);
                sqaimage.setImageResource(R.drawable.ic_multiplayer2);

                upctext.setTextColor(Color.parseColor("#ffffff"));
                ongtext.setTextColor(Color.parseColor("#ababab"));
                restext.setTextColor(Color.parseColor("#ababab"));
                sqatext.setTextColor(Color.parseColor("#ababab"));


            }
        });


        ong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upcimage.setImageResource(R.drawable.ic_pubg2);
                ongimage.setImageResource(R.drawable.ic_gamepad_controller);
                resimage.setImageResource(R.drawable.ic_rank2);
                sqaimage.setImageResource(R.drawable.ic_multiplayer2);

                upctext.setTextColor(Color.parseColor("#ababab"));
                ongtext.setTextColor(Color.parseColor("#ffffff"));
                restext.setTextColor(Color.parseColor("#ababab"));
                sqatext.setTextColor(Color.parseColor("#ababab"));


            }
        });


        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upcimage.setImageResource(R.drawable.ic_pubg2);
                ongimage.setImageResource(R.drawable.ic_gamepad_controller2);
                resimage.setImageResource(R.drawable.ic_rank);
                sqaimage.setImageResource(R.drawable.ic_multiplayer2);

                upctext.setTextColor(Color.parseColor("#ababab"));
                ongtext.setTextColor(Color.parseColor("#ababab"));
                restext.setTextColor(Color.parseColor("#ffffff"));
                sqatext.setTextColor(Color.parseColor("#ababab"));


            }
        });

        sqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upcimage.setImageResource(R.drawable.ic_pubg2);
                ongimage.setImageResource(R.drawable.ic_gamepad_controller2);
                resimage.setImageResource(R.drawable.ic_rank2);
                sqaimage.setImageResource(R.drawable.ic_multiplayer);
                upctext.setTextColor(Color.parseColor("#ababab"));
                ongtext.setTextColor(Color.parseColor("#ababab"));
                restext.setTextColor(Color.parseColor("#ababab"));
                sqatext.setTextColor(Color.parseColor("#ffffff"));


            }
        });

    }
}

package com.tirthcshahgmail.ifest15;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        LinearLayout galary = (LinearLayout) findViewById(R.id.galary);
        LinearLayout sponsers = (LinearLayout) findViewById(R.id.sponsers);
        LinearLayout about_us = (LinearLayout) findViewById(R.id.about_us);
        LinearLayout contact_us = (LinearLayout) findViewById(R.id.contact_us);
        LinearLayout events = (LinearLayout) findViewById(R.id.events);
        LinearLayout schedule = (LinearLayout) findViewById(R.id.schedule);
        LinearLayout register = (LinearLayout) findViewById(R.id.register);
        ImageView fb = (ImageView) findViewById(R.id.imageView);
        ImageView mail = (ImageView) findViewById(R.id.imageView5);

        //ImageView crom = (ImageView) findViewById(R.id.imageView3);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Developer.class);
                startActivity(i);
            }
        });
        galary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Winners.class);
                startActivity(i);
            }
        });

        sponsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Sponsers.class);
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent browserIntent = new Intent(getApplicationContext(), Registration.class);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ieee.daiict.ac.in/ifest15/#register"));
                startActivity(browserIntent);
            }
        });

        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(i);
            }
        });

        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainContact.class);
                startActivity(i);
            }
        });

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Event.class);
                startActivity(i);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/ifest15"));
                startActivity(browserIntent);
            }
        });



        /*mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ieee.daiict.ac.in/ifest15/#register"));
                startActivity(browserIntent);
            }
        });*/

        /*crom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ieee.daiict.ac.in/ifest15"));
                startActivity(browserIntent);
            }
        });*/
    }

}

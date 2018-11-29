package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_paws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paws);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnpawGall) {
            i = new Intent(this, activity_pawsgallery.class);
            startActivity(i);
        }

    }

    public void back (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnpawBackmenu) {
            i = new Intent(this, activity_main_menu.class);
            startActivity(i);
        }
    }

    public void onWeb(View v) {
        if (v.getId() == R.id.btnCaraWeb) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paws.org.ph/"));
            startActivity(i);
        }
    }

    public void processMap(View v) {
        Uri gmmIntentUri = Uri.parse("geo:14.6328,121.0761?q=  Philippine Animal Welfare Society");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
        }
    }

package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_happyanimalsclub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happyanimalsclub);
    }
    public void processGallery(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnHapGal) {
            i = new Intent(this, activity_happyanimalsclubgallery.class);
            startActivity(i);
        }

    }

    public void back (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPspBack) {
            i = new Intent(this, activity_main_menu.class);
            startActivity(i);
        }
    }

    public void onWeb(View v) {
        if (v.getId() == R.id.btnCaraWeb) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.happyanimalsclub.org/"));
            startActivity(i);
        }
    }

    public void processMap(View v) {
        Uri gmmIntentUri = Uri.parse("geo:7.0753,125.5647?q=  Happy Animals Club");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}

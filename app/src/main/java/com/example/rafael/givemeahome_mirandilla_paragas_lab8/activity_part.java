package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_part extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
    }

    public void processGallery(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPSPGall) {
            i = new Intent(this, activity_partgallery.class);
            startActivity(i);
        }

    }

    public void back (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPartBack) {
            i = new Intent(this, activity_main_menu.class);
            startActivity(i);
        }
    }

    public void onWeb(View v) {
        if (v.getId() == R.id.btnPspWeb) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.philanimalrescue.org/"));
            startActivity(i);
        }
    }

    public void processMap(View v) {
        Uri gmmIntentUri = Uri.parse("geo:14.8077,121.0727?q=  Philippinne Animal Rescue Team");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}

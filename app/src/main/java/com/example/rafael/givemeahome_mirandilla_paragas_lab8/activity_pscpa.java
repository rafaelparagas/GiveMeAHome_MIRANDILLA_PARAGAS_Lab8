package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_pscpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pscpa);
    }
    public void processGallery(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPSPGall) {
            i = new Intent(this, activity_pspcagallery.class);
            startActivity(i);
        }

    }

    public void back (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPscBack) {
            i = new Intent(this, activity_main_menu.class);
            startActivity(i);
        }
    }

    public void onWeb(View v) {
        if (v.getId() == R.id.btnPspWeb) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.geocities.ws/philspca/geninfo.html"));
            startActivity(i);
        }
    }

    public void processMap(View v) {
        Uri gmmIntentUri = Uri.parse("geo:14.6009,120.9881?q=  Philippine Society for Prevention of Cruelty to Animals");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}

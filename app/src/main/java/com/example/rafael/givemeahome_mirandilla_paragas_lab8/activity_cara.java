package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_cara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara);
    }
    public void processGallery(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnCaraGal) {
            i = new Intent(this, activity_cara_gallery.class);
            startActivity(i);
        }

    }

    public void back (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnMenu) {
            i = new Intent(this, activity_main_menu.class);
            startActivity(i);
        }
    }

    public void onWeb(View v) {
        if (v.getId() == R.id.btnCaraWeb) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.caraphil.org/"));
            startActivity(i);
        }
    }

    public void processMap(View v) {
        Uri gmmIntentUri = Uri.parse("geo:14.5838,121.0493?q=  CARA Welfare Philippines");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}

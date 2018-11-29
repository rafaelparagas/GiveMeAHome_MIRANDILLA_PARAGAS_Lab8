package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.PawsButton) {
            i = new Intent(this, activity_paws.class);
            startActivity(i);
        }

    }

    public void processHappy(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnHappy) {
            i = new Intent(this, activity_happyanimalsclub.class);
            startActivity(i);
        }

    }

    public void processCara(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnCara) {
            i = new Intent(this, activity_cara.class);
            startActivity(i);
        }

    }

    public void processPSP(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPsP) {
            i = new Intent(this, activity_pscpa.class);
            startActivity(i);
        }

    }

    public void processPart(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPSPGall) {
            i = new Intent(this, activity_part.class);
            startActivity(i);
        }
    }

    public void processAkf(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnAkf) {
            i = new Intent(this, activity_akf.class);
            startActivity(i);
        }
    }
}

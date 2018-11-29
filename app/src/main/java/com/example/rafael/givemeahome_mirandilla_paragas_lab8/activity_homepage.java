package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnFind) {
            i = new Intent(this, activity_main_menu.class);
            startActivity(i);
        }
    }
}

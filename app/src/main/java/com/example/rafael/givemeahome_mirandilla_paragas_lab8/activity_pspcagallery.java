package com.example.rafael.givemeahome_mirandilla_paragas_lab8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class activity_pspcagallery extends AppCompatActivity {

    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pspcagallery);

        int images[] = {R.drawable.psp1,R.drawable.psp2,R.drawable.psp3,R.drawable.psp4};
        v_flipper = findViewById(R.id.v_flipper);

      /*  for (int i = 0; i < images.length; i++){
            flipperImages(images[i]);
        }
        */
        //foreach
        for (int image: images){
            flipperImages(image);
        }

    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000); //4seconds
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);

    }
    public void back(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPspBack) {
            i = new Intent(this, activity_pscpa.class);
            startActivity(i);
        }
    }
}

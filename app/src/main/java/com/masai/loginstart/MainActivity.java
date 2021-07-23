package com.masai.loginstart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {

    private ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int n[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
        flipper = (ViewFlipper) findViewById(R.id.flipper);

        for (int i = 0; i < n.length; i++) {
            showImage(n[i], flipper);
        }
    }

    private void showImage(int img, ViewFlipper flipper) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
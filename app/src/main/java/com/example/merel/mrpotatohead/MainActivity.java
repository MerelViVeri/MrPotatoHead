package com.example.merel.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms;
    ImageView body;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize images and set to INVISIBLE at start
        arms = (ImageView) findViewById(R.id.arms);
        arms.setVisibility(View.INVISIBLE);

        body = (ImageView) findViewById(R.id.body);

        ears = (ImageView) findViewById(R.id.ears);
        ears.setVisibility(View.INVISIBLE);

        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyebrows.setVisibility(View.INVISIBLE);

        eyes = (ImageView) findViewById(R.id.eyes);
        eyes.setVisibility(View.INVISIBLE);

        glasses = (ImageView) findViewById(R.id.glasses);
        glasses.setVisibility(View.INVISIBLE);

        hat = (ImageView) findViewById(R.id.hat);
        hat.setVisibility(View.INVISIBLE);

        mouth = (ImageView) findViewById(R.id.mouth);
        mouth.setVisibility(View.INVISIBLE);

        mustache = (ImageView) findViewById(R.id.mustache);
        mustache.setVisibility(View.INVISIBLE);

        nose = (ImageView) findViewById(R.id.nose);
        nose.setVisibility(View.INVISIBLE);

        shoes = (ImageView) findViewById(R.id.shoes);
        shoes.setVisibility(View.INVISIBLE);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkArms:
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEars:
                if (checked) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEyebrows:
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkEyes:
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkGlasses:
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkHat:
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkMouth:
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkMustache:
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkNose:
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkShoes:
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}

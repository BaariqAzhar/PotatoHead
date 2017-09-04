package com.example.sebastiaan.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private View test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox eyesCheckBox = (CheckBox) findViewById(R.id.eyes_checkbox);
        View eyesView = findViewById(R.id.eyesView);

        //eyesCheckBox.setOnClickListener((View.OnClickListener) this);
    }
//
    public void onClick(View v) {
        CheckBox check = (CheckBox) v;
        switch (v.getId()) {
            case R.id.eyes_checkbox:
                View eyesView = findViewById(R.id.eyesView);
                if(check.isChecked()) {
                    eyesView.setVisibility(View.VISIBLE);
                } else {
                    eyesView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.hat_checkbox:
                View hatView = findViewById(R.id.hatView);
                if(check.isChecked()) {
                    hatView.setVisibility(View.VISIBLE);
                } else {
                    hatView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.arms_checkbox:
                View armsView = findViewById(R.id.armsView);
                if(check.isChecked()) {
                    armsView.setVisibility(View.VISIBLE);
                } else {
                    armsView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.ears_checkbox:
                View earsView = findViewById(R.id.earsView);
                if(check.isChecked()) {
                    earsView.setVisibility(View.VISIBLE);
                } else {
                    earsView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyebrows_checkbox:
                View eyebrowsView = findViewById(R.id.eyebrowsView);
                if(check.isChecked()) {
                    eyebrowsView.setVisibility(View.VISIBLE);
                } else {
                    eyebrowsView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glasses_checkbox:
                View glassesView = findViewById(R.id.glassesView);
                if(check.isChecked()) {
                    glassesView.setVisibility(View.VISIBLE);
                } else {
                    glassesView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouth_checkbox:
                View mouthView = findViewById(R.id.mouthView);
                if(check.isChecked()) {
                    mouthView.setVisibility(View.VISIBLE);
                } else {
                    mouthView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mustache_checkbox:
                View mustacheView = findViewById(R.id.mustacheView);
                if(check.isChecked()) {
                    mustacheView.setVisibility(View.VISIBLE);
                } else {
                    mustacheView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.nose_checkbox:
                View noseView = findViewById(R.id.noseView);
                if(check.isChecked()) {
                    noseView.setVisibility(View.VISIBLE);
                } else {
                    noseView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.shoes_checkbox:
                View shoesView = findViewById(R.id.shoesView);
                if(check.isChecked()) {
                    shoesView.setVisibility(View.VISIBLE);
                } else {
                    shoesView.setVisibility(View.INVISIBLE);
                }
                break;

            default:
                break;
        }
    }



    //public View hatView = findViewById(R.id.hatView);
    //private ImageView glassesImageView = (ImageView) findViewById(R.id.glassesView);
//    private CheckBox hatCheckBox = (CheckBox) findViewById(R.id.hat_checkbox);


    //hatCheckbox.

//    public void removeHat(View view) {
//        CheckBox hatCheckBox = (CheckBox) view;
//        View hatView = findViewById(R.id.hatView);
//        if(hatCheckBox.isChecked()) {
//            hatView.setVisibility(View.VISIBLE);
//        } else {
//            hatView.setVisibility(View.INVISIBLE);
//        }
//    }
}

package com.example.sebastiaan.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // initialize the image Views to hide/unhide
    private View armsView;
    private View earsView;
    private View eyebrowsView;
    private View eyesView;
    private View glassesView;
    private View hatView;
    private View mouthView;
    private View mustacheView;
    private View noseView;
    private View shoesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find ids of the image Views 
        armsView = findViewById(R.id.armsView);
        earsView = findViewById(R.id.earsView);
        eyebrowsView = findViewById(R.id.eyebrowsView);
        eyesView = findViewById(R.id.eyesView);
        glassesView = findViewById(R.id.glassesView);
        hatView = findViewById(R.id.hatView);
        mouthView = findViewById(R.id.mouthView);
        mustacheView = findViewById(R.id.mustacheView);
        noseView = findViewById(R.id.noseView);
        shoesView = findViewById(R.id.shoesView);
    }

    // Save state in case of rotation
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // check if Views are visible
        int armsVisible = armsView.getVisibility();
        int earsVisible = earsView.getVisibility();
        int eyebrowsVisible = eyebrowsView.getVisibility();
        int eyesVisible = eyesView.getVisibility();
        int glassesVisible = glassesView.getVisibility();
        int hatVisible = hatView.getVisibility();
        int mouthVisible = mouthView.getVisibility();
        int mustacheVisible = mustacheView.getVisibility();
        int noseVisible = noseView.getVisibility();
        int shoesVisible = shoesView.getVisibility();

        // put visibilities into the out state
        outState.putInt("armsVisible", armsVisible);
        outState.putInt("earsVisible", earsVisible);
        outState.putInt("eyebrowsVisible", eyebrowsVisible);
        outState.putInt("eyesVisible", eyesVisible);
        outState.putInt("glassesVisible", glassesVisible);
        outState.putInt("hatVisible", hatVisible);
        outState.putInt("mouthVisible", mouthVisible);
        outState.putInt("mustacheVisible", mustacheVisible);
        outState.putInt("noseVisible", noseVisible);
        outState.putInt("shoesVisible", shoesVisible);
    }

    // Restore previous state in case of rotation
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        // check previous visibilities
        int armsVisible = inState.getInt("armsVisible");
        int earsVisible = inState.getInt("earsVisible");
        int eyebrowsVisible = inState.getInt("eyebrowsVisible");
        int eyesVisible = inState.getInt("eyesVisible");
        int glassesVisible = inState.getInt("glassesVisible");
        int hatVisible = inState.getInt("hatVisible");
        int mouthVisible = inState.getInt("mouthVisible");
        int mustacheVisible = inState.getInt("mustacheVisible");
        int noseVisible = inState.getInt("noseVisible");
        int shoesVisible = inState.getInt("shoesVisible");

        // "hatView.setVisibility(earsVisible)"   gave an error so I had to check manually
        if(armsVisible == View.VISIBLE) {
            armsView.setVisibility(View.VISIBLE);
        } else {
            armsView.setVisibility(View.INVISIBLE);
        }
        if(earsVisible == View.VISIBLE) {
            earsView.setVisibility(View.VISIBLE);
        } else {
            earsView.setVisibility(View.INVISIBLE);
        }
        if(eyebrowsVisible == View.VISIBLE) {
            eyebrowsView.setVisibility(View.VISIBLE);
        } else {
            eyebrowsView.setVisibility(View.INVISIBLE);
        }
        if(eyesVisible == View.VISIBLE) {
            eyesView.setVisibility(View.VISIBLE);
        } else {
            eyesView.setVisibility(View.INVISIBLE);
        }
        if(glassesVisible == View.VISIBLE) {
            glassesView.setVisibility(View.VISIBLE);
        } else {
            glassesView.setVisibility(View.INVISIBLE);
        }
        if(hatVisible == View.VISIBLE) {
            hatView.setVisibility(View.VISIBLE);
        } else {
            hatView.setVisibility(View.INVISIBLE);
        }
        if(mouthVisible == View.VISIBLE) {
            mouthView.setVisibility(View.VISIBLE);
        } else {
            mouthView.setVisibility(View.INVISIBLE);
        }
        if(mustacheVisible == View.VISIBLE) {
            mustacheView.setVisibility(View.VISIBLE);
        } else {
            mustacheView.setVisibility(View.INVISIBLE);
        }
        if(noseVisible == View.VISIBLE) {
            noseView.setVisibility(View.VISIBLE);
        } else {
            noseView.setVisibility(View.INVISIBLE);
        }
        if(shoesVisible == View.VISIBLE) {
            shoesView.setVisibility(View.VISIBLE);
        } else {
            shoesView.setVisibility(View.INVISIBLE);
        }
    }

    // when an checkbox is clicked, check which corresponding image should be (un)hidden
    public void onClick(View v) {
        CheckBox check = (CheckBox) v;
        switch (v.getId()) {
            case R.id.eyes_checkbox:
                if(check.isChecked()) {
                    eyesView.setVisibility(View.VISIBLE);
                } else {
                    eyesView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.hat_checkbox:
                if(check.isChecked()) {
                    hatView.setVisibility(View.VISIBLE);
                } else {
                    hatView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.arms_checkbox:
                if(check.isChecked()) {
                    armsView.setVisibility(View.VISIBLE);
                } else {
                    armsView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.ears_checkbox:
                if(check.isChecked()) {
                    earsView.setVisibility(View.VISIBLE);
                } else {
                    earsView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyebrows_checkbox:
                if(check.isChecked()) {
                    eyebrowsView.setVisibility(View.VISIBLE);
                } else {
                    eyebrowsView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glasses_checkbox:
                if(check.isChecked()) {
                    glassesView.setVisibility(View.VISIBLE);
                } else {
                    glassesView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouth_checkbox:
                if(check.isChecked()) {
                    mouthView.setVisibility(View.VISIBLE);
                } else {
                    mouthView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mustache_checkbox:
                if(check.isChecked()) {
                    mustacheView.setVisibility(View.VISIBLE);
                } else {
                    mustacheView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.nose_checkbox:
                if(check.isChecked()) {
                    noseView.setVisibility(View.VISIBLE);
                } else {
                    noseView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.shoes_checkbox:
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
}

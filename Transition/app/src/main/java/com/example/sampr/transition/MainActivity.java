package com.example.sampr.transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;


public class MainActivity extends AppCompatActivity {

    ViewGroup mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = (ViewGroup) findViewById(R.id.main_layout);
        mainLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        moveButton();
                        return true;
                    }
                }
        );

    }

    public void moveButton() {
        View mainButton = (View) findViewById(R.id.main_button);
        TransitionManager.beginDelayedTransition(mainLayout);

        //change position of button
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        mainButton.setLayoutParams(positionRules);

        //change size of button
        ViewGroup.LayoutParams sizeRules = mainButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        mainButton.setLayoutParams(sizeRules);
    }
}

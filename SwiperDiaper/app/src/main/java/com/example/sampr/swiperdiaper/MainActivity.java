package com.example.sampr.swiperdiaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView sampritysMessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampritysMessage = (TextView)findViewById(R.id.sampritysText);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        sampritysMessage.setText("singleTap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        sampritysMessage.setText("doubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        sampritysMessage.setText("doubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        sampritysMessage.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        sampritysMessage.setText("showPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        sampritysMessage.setText("singleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        sampritysMessage.setText("scroll!");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        sampritysMessage.setText("longgggg press");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        sampritysMessage.setText("flingggg");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}

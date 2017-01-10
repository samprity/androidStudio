package com.example.sampr.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Oranges extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oranges);
        Bundle appleData = getIntent().getExtras();
        if(appleData == null){
            return;
        }
        String appleMessage = appleData.getString("appleMessage");
        final TextView orangeText = (TextView) findViewById(R.id.orangeText);
        orangeText.setText(appleMessage);
    }
    public void onClick(View view){
        Intent i = new Intent(this, Apples.class);
        startActivity(i);
    }
}

package com.example.sampr.practice2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sampritysButton1 = (Button)findViewById(R.id.sampritysButton);
        sampritysButton1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView sampritysText = (TextView)findViewById(R.id.sampritysText);
                        sampritysText.setText("Good job Hoss!");
                    }
                }
        );
        sampritysButton1.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView sampritysText = (TextView)findViewById(R.id.sampritysText);
                        sampritysText.setText("Holy carp, that was a long one!");
                        return true;
                    }
                }
        );
    }

}

package com.dxc.digitalservices.androidintro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bangButton = (Button) findViewById(R.id.bang);
        bangButton.setOnClickListener(new ButtonListener());

        Button friendButton = (Button) findViewById(R.id.friend);
        friendButton.setOnClickListener(new ButtonListener());

        Button seinfeldButton = (Button) findViewById(R.id.seinfeld);
        seinfeldButton.setOnClickListener(new ButtonListener());

        Button motherButton = (Button) findViewById(R.id.mother);
        motherButton.setOnClickListener(new ButtonListener());
    }


    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            Button button = (Button) v;

            String phrase = button.getText().toString();

            Intent displayIntent = new Intent(MainActivity.this, Display.class);
            displayIntent.putExtra("phrase", phrase);
            startActivity(displayIntent);
        }
    }
}

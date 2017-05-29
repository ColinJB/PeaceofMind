package com.epicodus.peaceofmind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mLocationInputHome;
    private Button mLocationInputHomeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationInputHome = (EditText) findViewById(R.id.locationInputHome);
        mLocationInputHomeButton = (Button) findViewById(R.id.locationInputHomeButton);

        mLocationInputHomeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LocationDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}

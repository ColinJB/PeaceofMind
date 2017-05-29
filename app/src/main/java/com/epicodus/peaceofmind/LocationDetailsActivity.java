package com.epicodus.peaceofmind;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LocationDetailsActivity extends AppCompatActivity {
    public static final String TAG = LocationDetailsActivity.class.getSimpleName();
    private TextView mLocationInputFromIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);
        mLocationInputFromIntent = (TextView) findViewById(R.id.locationInputFromIntent);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationInputFromIntent.setText(location);
    }
}

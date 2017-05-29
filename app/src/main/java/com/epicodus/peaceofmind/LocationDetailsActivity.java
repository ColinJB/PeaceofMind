package com.epicodus.peaceofmind;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LocationDetailsActivity extends AppCompatActivity {
    public static final String TAG = LocationDetailsActivity.class.getSimpleName();
    @Bind(R.id.locationInputFromIntent) TextView mLocationInputFromIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationInputFromIntent.setText(location);
    }
}

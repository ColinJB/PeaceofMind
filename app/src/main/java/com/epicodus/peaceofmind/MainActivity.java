package com.epicodus.peaceofmind;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind (R.id.locationInputHome) EditText mLocationInputHome;
    @Bind (R.id.locationInputHomeButton) Button mLocationInputHomeButton;
    @Bind(R.id.sloganHome) TextView mSloganHome;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface defyingGravity = Typeface.createFromAsset(getAssets(), "fonts/kgdefyinggravity.ttf");
        mSloganHome.setTypeface(defyingGravity);

        mLocationInputHomeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mLocationInputHomeButton) {
            String location = mLocationInputHome.getText().toString();
            Intent intent = new Intent(MainActivity.this, LocationDetailsActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}

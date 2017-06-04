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
    @Bind(R.id.aboutLinkHome) TextView mAboutLinkHome;
    @Bind(R.id.contactLinkHome) TextView mContactLinkHome;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface defyingGravity = Typeface.createFromAsset(getAssets(), "fonts/kgdefyinggravity.ttf");
        mSloganHome.setTypeface(defyingGravity);

        mLocationInputHomeButton.setOnClickListener(this);
        mAboutLinkHome.setOnClickListener(this);
        mContactLinkHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mLocationInputHomeButton) {
            if(mLocationInputHome.getText().toString().length() < 3) {
                Toast.makeText(MainActivity.this, "Please enter a valid input.", Toast.LENGTH_LONG).show();
            } else {
                String location = mLocationInputHome.getText().toString();
                Intent intent = new Intent(MainActivity.this, LocationDetailsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        } else if (v == mAboutLinkHome) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        } else if (v == mContactLinkHome) {
            Intent intent = new Intent(MainActivity.this, ContactActivity.class);
            startActivity(intent);
        }
    }
}

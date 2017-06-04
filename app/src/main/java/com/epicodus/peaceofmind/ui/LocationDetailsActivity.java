package com.epicodus.peaceofmind;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LocationDetailsActivity extends AppCompatActivity {
    public static final String TAG = LocationDetailsActivity.class.getSimpleName();
    @Bind(R.id.locationInputFromIntent) TextView mLocationInputFromIntent;
    @Bind(R.id.detailsTitle) TextView mDetailsTitle;
    @Bind(R.id.mostDangerousListDetails) ListView mMostDangerousListDetails;
    private String[] locations = new String[] {"Buckhead", "Bankhead",
            "Midtown", "Little Five Points", "Westside", "Cabbage Town",
            "Downtown", "Marietta", "Smyrna", "Bluffs"};
    private String[] dangerLevels = new String[] {"Medium", "Very High", "Low", "Medium", "High", "Medium", "High", "High", "Low", "Very High"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationInputFromIntent.setText("Here are the most dangerous places in " + location);

        PeaceOfMindArrayAdapter adapter = new PeaceOfMindArrayAdapter(this, android.R.layout.simple_list_item_1, locations, dangerLevels);
        mMostDangerousListDetails.setAdapter(adapter);

        mMostDangerousListDetails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String location = ((TextView)view).getText().toString();
                Toast.makeText(LocationDetailsActivity.this, location, Toast.LENGTH_LONG).show();
            }
        });
    }
}

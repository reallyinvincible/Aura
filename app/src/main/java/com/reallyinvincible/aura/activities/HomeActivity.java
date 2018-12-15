package com.reallyinvincible.aura.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.reallyinvincible.aura.R;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SharedPreferences sharedPreferences = getSharedPreferences("Information", MODE_PRIVATE);
        String phoneNumber = sharedPreferences.getString("UserPhoneNumber", "0");
        ((TextView)findViewById(R.id.tv_user_name)).setText(phoneNumber);
        findViewById(R.id.btn_sample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disasterReportIntent = new Intent(HomeActivity.this, ReportDisasterActivity.class);
                startActivity(disasterReportIntent);
            }
        });

        findViewById(R.id.btn_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapDisasterIntent = new Intent(HomeActivity.this, DisasterMapsActivity.class);
                startActivity(mapDisasterIntent);
            }
        });
    }
}

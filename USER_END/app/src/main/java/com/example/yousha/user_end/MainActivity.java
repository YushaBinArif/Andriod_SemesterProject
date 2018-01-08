package com.example.yousha.user_end;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Just to test that if CallAmbulance_Activity is working//
        startActivity(new Intent(MainActivity.this,CallAmbulance_Activity.class));
    }
}

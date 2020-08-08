package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMSG2);
        txtVMsg2.setText(R.string.MSG2);

        Log.i("LifeCycle" , "OnCreate() invoked");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle" , "OnStart() invoked");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle" , "OnResume() invoked");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("LifeCycle" , "OnRestart() invoked");

    }
}
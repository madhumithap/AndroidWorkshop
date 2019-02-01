package com.example.codher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MAIN_ACTIVITY_TAG = "MainActivity";
    static final String HOTEL_NAME_INTENT_KEY = "HOTEL_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MAIN_ACTIVITY_TAG, "----------------- Creating");
        setContentView(R.layout.activity_main);
        final Button bookButton = findViewById(R.id.bookButton);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookingConfirmationIntent = new Intent(MainActivity.this, BookingConfirmationActivity.class);
                TextView hotelNameView = findViewById(R.id.hotelName);
                bookingConfirmationIntent.putExtra(HOTEL_NAME_INTENT_KEY, hotelNameView.getText());
                startActivity(bookingConfirmationIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MAIN_ACTIVITY_TAG, "----------------- Starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MAIN_ACTIVITY_TAG, "----------------- Resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MAIN_ACTIVITY_TAG, "----------------- Pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MAIN_ACTIVITY_TAG, "----------------- Stopping");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MAIN_ACTIVITY_TAG, "----------------- Destroying");
    }


}

package com.example.codher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BookingConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_confirmation);
        TextView hotelNameView = findViewById(R.id.hotelName);
        String hotelName = getIntent().getStringExtra(MainActivity.HOTEL_NAME_INTENT_KEY);
        hotelNameView.setText(hotelName);

    }
}

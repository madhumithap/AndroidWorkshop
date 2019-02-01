package com.example.codher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bookButton = findViewById(R.id.bookButton);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookButton.setText(R.string.booking_success_msg);
            }
        });
    }
}

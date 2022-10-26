package com.example.seanseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    ImageView imageView, imageView2, imageView3, imageView4, imageView5;
    Button buttonAllScreenings, buttonSeatsOccupancy, buttonAllRooms, buttonEmployees, buttonUpcomingMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSplash = new Intent(MainActivity.this, .class);
                startActivity(intentSplash);
            }
        });
    }

}

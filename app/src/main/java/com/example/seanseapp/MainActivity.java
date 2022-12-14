package com.example.seanseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    Connection conn;
    TextView textView;
    String ConnectionResult="";
    ImageView imageView, imageView2, imageView3, imageView4, imageView5;
    Button buttonAllScreenings, buttonSeatsOccupancy, buttonAllRooms, buttonEmployees, buttonUpcomingMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        buttonAllScreenings = findViewById(R.id.buttonAllScreenings);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSplash = new Intent(MainActivity.this, AllScreeningsActivity.class);
                startActivity(intentSplash);
            }
        });
    }

    public void buttonAllScreenings (View view)
    {
        try {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            conn = connectionHelper.connect();
            if (conn!=null)
            {
                String query = "Select * from Pracownicy where id_pracownika='1'";
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery(query);

                while (resultSet.next())
                {
                    textView.setText(resultSet.getString(1));
                }
            }
            else
            {
                ConnectionResult="Check Connection";
            }
        }
        catch (Exception e)
        {

        }
    }

}

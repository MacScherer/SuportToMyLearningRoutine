package com.example.testenviroment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home myHome = new Home(); // myHome = object on memory associated to a class Home
                                  // Can access resources from Home Class from myHome object
                                  // Like Methods and variables using a dot
        myHome.color = "Blue";

        Home mySecondHome = new Home(); // New object associated to Home
        mySecondHome.color = "White";
        mySecondHome.openDoor();

    }
}

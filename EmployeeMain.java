package com.example.testenviroment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee myEmployee = new Employee();
        myEmployee.Name = "Mac";
        myEmployee.Salary = 1000.0;

        Double Salary = myEmployee.retrieveSalary(150, 10);
        System.out.println(myEmployee + " salary is " + Salary);

    

    }
}

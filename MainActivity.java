//package com.example.respec;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Method;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        //getSupportActionBar().setTitle(""); // set the top title
        actionBar.hide(); // or even hide the actionbar
        int steparr[]={10,10,10,10,10,10,10,10,10,10};
         int avg=mathMan(steparr);



    }

    public static int mathMan(int empStep[]){
        int employeeCount = empStep.length;
        int total = 0;
        int i = 0;
        while( i < employeeCount)
        {
            total += empStep[i];
            i++;
        }
        int average = total / employeeCount;
        return average;
    }
}
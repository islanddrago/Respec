package com.example.respec;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private static String[] officeNames = { "Austin, TX", "CASTROVILLE, TX", "RICHARDSON, TX", "SAN ANTONIO, TX",
            "HURRICANE, WV", "RESPEC CONSULTING INC.", "SANTA FE, NM", "ROSEVILLE, MN", "DENVER, CO", "RAPID CITY, SD",
            "ROCHESTER, NY", "RENO, NV", "EDMONTON, AB" };
    String[] winners={"test","test","test"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        //getSupportActionBar().setTitle(""); // set the top title
        actionBar.hide(); // or even hide the actionbar

        int steparr[]={10,10,10,10,10,10,10,10,10,50};
         int avg=mathMethod.mathMan(steparr);
         getWinnerOffice();

       // TextView view = findViewById(R.id.textView3);
        //String average=String.valueOf(avg);
        //view.setText(average);
      //mathMethod.mathMan()




    }

    public  String[] getWinnerOffice() {
        Random rand = new Random(); //instance of random class
        int upperbound = 13;

        // gene the rand num based on the bound
        int int_random = rand.nextInt(upperbound);
        int int_random2 = rand.nextInt(upperbound);
        int int_random3 = rand.nextInt(upperbound);

        // gen winner based on the office array
        String winnerName = RandOffice.WinnerOffice(int_random, officeNames);
        String winnerName2 = RandOffice.WinnerOffice(int_random2, officeNames);
        String winnerName3 = RandOffice.WinnerOffice(int_random3, officeNames);
        winners[0] = winnerName;
        winners[1] = winnerName2;
        winners[2] = winnerName3;
        TextView view1 = findViewById(R.id.textView3);
        TextView view2= findViewById(R.id.textView4);
        TextView view3 = findViewById(R.id.textView5);
        view1.setText( winnerName);
        view2.setText( winners[1]);
        view3.setText( winners[2]);

        return winners;
    }

}


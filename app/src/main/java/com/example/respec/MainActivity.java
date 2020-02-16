package com.example.respec;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private static String[] officeNames = { "Austin, TX", "CASTROVILLE, TX", "RICHARDSON, TX", "SAN ANTONIO, TX",
            "HURRICANE, WV", "RESPEC CONSULTING INC.", "SANTA FE, NM", "ROSEVILLE, MN", "DENVER, CO", "RAPID CITY, SD",
            "ROCHESTER, NY", "RENO, NV", "EDMONTON, AB" };
   int[] Steps_Data = {2768, 5023, 2516, 2561, 5148, 3557, 1473, 646, 18, 2085, 4070, 5355, 2090, 3287, 4052, 931, 1652, 2566, 3722, 9761, 7685, 3645, 773, 2538, 8017, 6232, 7149, 2199, 16316, 2244, 1594};
    String[] winners={"test","test","test"};
    int[] officeAvgScore={10,10,10,10,10,10,10};



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
        Random rand = new Random(); //instance of random class
         for(int i=0;i<6;i++)
         {
             officeAvgScore[i]=Steps_Data[rand.nextInt(30)];
         //rand.nextInt(300);
         }
         int one=getAvgScore();
        for(int i=0;i<6;i++)
        {
            officeAvgScore[i]=Steps_Data[rand.nextInt(30)];
        }
         int two=getAvgScore();
        for(int i=0;i<6;i++)
        {
            officeAvgScore[i]=Steps_Data[rand.nextInt(30)];
        }
         int three=getAvgScore();
        TextView view = findViewById(R.id.textView6);
        String average=String.valueOf(one);
        view.setText(average);
         view = findViewById(R.id.textView7);
        average=String.valueOf(two);
        view.setText(average);
         view = findViewById(R.id.textView8);
        average=String.valueOf(three);
        view.setText(average);
        two=officeAvgScore[6];
        average=String.valueOf(two);
        view = findViewById(R.id.textView11);
        view.setText(average);

       // TextView view = findViewById(R.id.textView3);
        //String average=String.valueOf(avg);
        //view.setText(average);
      //mathMethod.mathMan()


       // this.officeAvgScore = Score;

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
    public int getAvgScore() {
      //  mathMethod mMethod = new mathMethod();
        int mwinners = mathMethod.mathMan(this.officeAvgScore);
        return mwinners;
    }
    public void  random(View view){
        getWinnerOffice();
        Random rand = new Random(); //instance of random class
        for(int i=0;i<6;i++)
        {
            officeAvgScore[i]=Steps_Data[rand.nextInt(31)];
        }
        int one=getAvgScore();
        for(int i=0;i<6;i++)
        {
            officeAvgScore[i]=Steps_Data[rand.nextInt(31)];
        }
        int two=getAvgScore();
        for(int i=0;i<6;i++)
        {
            officeAvgScore[i]=Steps_Data[rand.nextInt(31)];
        }
        int three=getAvgScore();
        TextView views = findViewById(R.id.textView6);
        String average=String.valueOf(one);
        views.setText(average);
        views = findViewById(R.id.textView7);
        average=String.valueOf(two);
        views.setText(average);
        views = findViewById(R.id.textView8);
        average=String.valueOf(three);
        views.setText(average);
        two=rand.nextInt(300);
        average=String.valueOf(two);

        views = findViewById(R.id.textView9);
        two=rand.nextInt(10000);
        average=String.valueOf(two+5000);
        views.setText(average);
    }
    public void  count(View view){
        officeAvgScore[6]++;
        int two=officeAvgScore[6];
        String average=String.valueOf(two);
        TextView views = findViewById(R.id.textView11);
        views.setText(average);


    }


}


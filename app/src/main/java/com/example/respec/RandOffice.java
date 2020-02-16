package com.example.respec;
import java.util.Random;


// rand gen which office wins each time ..   
public class RandOffice {
    private static String[] officeNames = { "Austin, TX", "CASTROVILLE, TX", "RICHARDSON, TX", "SAN ANTONIO, TX",
            "HURRICANE, WV", "RESPEC CONSULTING INC.", "SANTA FE, NM", "ROSEVILLE, MN", "DENVER, CO", "RAPID CITY, SD",
            "ROCHESTER, NY", "RENO, NV", "EDMONTON, AB" };
    String[] winners={"test","test","test"};

    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 13;

        // gene the rand num based on the bound
      int int_random = rand.nextInt(upperbound); 
      int int_random2 = rand.nextInt(upperbound);
      int int_random3 = rand.nextInt(upperbound);

        // gen winner based on the office array
      String winnerName = WinnerOffice(int_random, officeNames);
      String winnerName2 = WinnerOffice(int_random2, officeNames);
      String winnerName3 = WinnerOffice(int_random3, officeNames);

        // output to screen for dedugging purpoeses 
      System.out.println("Winner num 1 " + winnerName);
      System.out.println("Winner num 2 " + winnerName2);
      System.out.println("Winner num 3 " + winnerName3);
    }

    public static String WinnerOffice(int rand, String officeNames[]) {
        String winnerOffice = officeNames[rand];
        return winnerOffice;
    }


}

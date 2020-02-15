/*
Execpt only int of avg and string of office name as input.
Make Scoreboard system to find the higest of the all ints and diplay the int value and string
*/

import java.util.Random; // rand gen whitch office wins each time ..   


public class Scoreboard {
    int officeAvgScore;
    
    private
    String[] officeNames = { "Austin, TX", "CASTROVILLE, TX", "RICHARDSON, TX", "SAN ANTONIO, TX", "HURRICANE, WV",
            "RESPEC CONSULTING INC.", "SANTA FE, NM", "ROSEVILLE, MN", "DENVER, CO", "RAPID CITY, SD", "ROCHESTER, NY",
            "RENO, NV", "EDMONTON, AB" };
    String[] officeWinnersNames;
    int WinnersScores;

    public Scoreboard(int Score) {
        this.officeAvgScore = Score;
    }

    public String[] getWinnersNames() {
        // System.out.println("Hello Names");
        return officeWinnersNames;
    }

    public int getWinnersScores() {
        // System.out.println("Hello Scores");
        return WinnersScores;
    }

    public void main(final String[] args) {
    getWinnersNames();
    getWinnersScores();
  }
}



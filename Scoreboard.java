/*
Execpt only int of avg and string of office name as input.
Make Scoreboard system to find the higest of the all ints and diplay the int value and string
*/

import java.util.Random;

public class Scoreboard {
    int officeAvgScore;
    
    private
    int[] WinnersScores;

    public Scoreboard(int Score) {
        this.officeAvgScore = Score;
    }

    public String[] getWinnersNames() {
        RandOffice rOffice = new RandOffice();
        String[] rwinners = rOffice.getWinnerOffice();
        return rwinners;
    }

    public int[] getWinnersScores() {
        System.out.println("Hello Scores");
        return WinnersScores;
    }


}




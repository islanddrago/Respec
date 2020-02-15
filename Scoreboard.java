/*
Execpt only int of avg and string of office name as input.
Make Scoreboard system to find the higest of the all ints and diplay the int value and string
*/


public class Scoreboard {
    String officeName;
    int officeAvgScore;
    
    private
    String WinnersNames;
    int WinnersScores;

    public Scoreboard(String name, int Score ) {
        this.officeName = name;
        this.officeAvgScore = Score;
    }

    public String getWinnersNames() {
        return WinnersNames;
    }

    public int getWinnersScores() {
        return WinnersScores;
    }

}
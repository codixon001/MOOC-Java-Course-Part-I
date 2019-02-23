// This program is from Exercise 13, called "NHL Statistics Part I".
// It introduces the coder a little bit to classes and methods.
// The class used in the Main body of this program is a "course-provided" class called "NHLStatistics", and the methods 
// from the NHLStatistics class are used to fetch and see NHL players' score data, including 
// their number of played games, goals, assists, points, and penalty amount.

import java.util.Scanner;
import nhlstats.NHLStatistics;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top 10 NHL Players by Goals Scored:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        
        System.out.println("Top 25 Players by Penalty Amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        
        System.out.println("Sidney Crosby's Statistics:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        
        System.out.println("Philadelphia Flyers Team Statistics:");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("");
        
        System.out.println("Anaheim Ducks Player Statistics, sorted by Points Scored:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}

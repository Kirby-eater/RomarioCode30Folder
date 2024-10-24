// Project Name: Miles Per Hour
// Name: Romario Bonnick
// Date: 24 October 2024
// Description:  Given a distance traveled (miles) and elapsed time (hours and minutes), calculate the speed in miles per hour.  

import java.util.Scanner;

public class MPHRunner {
    public static void main(String[] args) throws Exception {
        MilesPerHour speed = new MilesPerHour();
        Scanner keys = new Scanner(System.in);

        speed.calc();

        keys.close();
        
    }
}

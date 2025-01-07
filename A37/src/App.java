import java.util.Scanner;

// Name: Romario Bonnick
// Project Name: Reverse Raffle Draw
// Date: 11 December 2024
// Description: A raffle draw where the name drawn from a hat they DOES NOT win. The last name drawn is the actual winner.

public class App {
    public static void main(String[] args) throws Exception {
        Raffle robby = new Raffle();
        System.out.println("In this game, there are names in a hat and you want your name to be drawn out last to win the game");
        Thread.sleep(2500);
        System.out.println("Good Luck!");

        robby.Mixer();
    }
}

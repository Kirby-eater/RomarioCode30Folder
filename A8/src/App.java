// Program Name: Input Basics
// Name: Romario Bonnick
// Date: 24 September 2024
// Description: Define, input, and print some variables and their values

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Keys = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int num1 = Keys.nextInt();

        System.out.print("Enter an integer:");
        int num2 = Keys.nextInt();

        // Double code
        System.out.print("Enter an double:");
        double num3 = Keys.nextDouble();

        System.out.print("Enter an double:");
        double num4 = Keys.nextDouble();


        // Results
        int dip = num1 + num2;
        System.out.println("Your integer is " + dip);

        double tip = num3 + num4;
        System.out.print("Your double is " + tip);


    }
}

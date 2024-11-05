// Project Name: Cool Numbers
// Name: Romario Bonnick
// Date: 4 November 2024
// Description: Determine if a number is a cool number

import java.util.Scanner;

public class CoolNumsRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        CoolNums cooler = new CoolNums();
        int user;

        System.out.print("Enter your number: ");
        user = keys.nextInt();
        cooler.count(user);

        keys.close();
       
    }
    
}



//Imports the Scanner Class into the program
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner Keys = new Scanner(System.in);
        
        
        
        System.out.print("Enter an integer:");
        int num = Keys.nextInt();
        Keys.nextInt();
        System.out.println("You selected the number " + num);

        System.out.print("What is your name? ");
        String name = Keys.nextLine();
        System.out.println("You entered: " + name);
    }
}

import java.util.Scanner;

public class LeapYear {
    private Scanner keys = new Scanner(System.in);
    private int year = 0;
    public int ans1 = 0;
    public int ans2 = 0;
    private int ans3 = 0;

    public void calc() {
        System.out.print("Enter the year: ");
        year = keys.nextInt();
        ans1 = year % 4;
        ans2 = year % 100;
        ans3 = year % 400;

        if( ans1 > 0 || ans3 > 0) {
            System.out.print(year + " is not a leap year");
            
        }
        
    
        

        else {
            System.out.print(year + " is a leap year");
        }

        }

        

    }




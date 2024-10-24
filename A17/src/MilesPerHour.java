import java.util.Scanner;

public class MilesPerHour {
    private Scanner keys = new Scanner(System.in);
    private double d = 0;
    private double h = 0;
    private double m = 0;
    private double t = 0;
    private double ans = 0;


    public void calc() {
        System.out.print("Enter the distance: ");
        d = keys.nextDouble();
        System.out.print("Enter the hours: ");
        h = keys.nextDouble();
        System.out.print("Enter the minutes: ");
        m = keys.nextDouble();
        m = m / 60;
        t = m + h;
     


        ans = d / t;
        System.out.print(d + " miles in " + h + " and " + m + " minutes = " + ans + "MPH");
    }

}

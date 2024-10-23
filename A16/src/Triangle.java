import java.util.Scanner;
public class Triangle {
    private Scanner keys = new Scanner(System.in);
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private double per = 0;
    private double s = 0;
    private double ans = 0;


    public void calc() {
        System.out.print("Enter side length 1: ");
        a = keys.nextInt();
        System.out.print("Enter side length 2: ");
        b = keys.nextInt();
        System.out.print("Enter side length 3: ");
        c = keys.nextInt();
        per = (a + b + c);

        s = per / 2;
        ans = Math.sqrt(s*(s - a) * (s - b) * (s - c));
        System.out.print("The sides you entered are " + a + ", " + b + ", " + c + ", " + "and the area is " + ans);
    }

}

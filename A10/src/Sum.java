import java.util.Scanner;
public class Sum {
    Scanner keys = new Scanner(System.in);

    private int num1 = 0;
    private int num2 = 0;

    public void input() {
        System.out.print("Enter a number: ");
        num1 = keys.nextInt();

        System.out.print("Enter a number: ");
        num2 = keys.nextInt();
    }

    public void solve() {

        int case = (num1 + num2);

        System.out.println("Your answer is " + case);
    }


}

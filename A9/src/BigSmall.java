import java.util.Scanner;

public class BigSmall {
    Scanner keys = new Scanner(System.in);

    private int num1 = 0;  //a
    private int num2 = 0;  //b

    public void input() {
        System.out.print("Enter a number: ");
         num1 = keys.nextInt();

        System.out.print("Enter a number: ");
         num2 = keys.nextInt();
        

    }

    public void check() {

        if (num1 > num2) {
            System.out.print("Yes");

        }

        if (num1 < num2) {
            System.out.print("No");

        }

        if (num1 == num2) {
            System.out.print("Equal");

        }



    }
}

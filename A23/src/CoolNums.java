import java.util.Scanner;

public class CoolNums {
    private Scanner keys = new Scanner(System.in);
    private int c1 = 0;
    private int c2 = 0;
    private int c3 = 0;
    private int c4 = 0;
    private int user = 0;
    private int counter = 0;

    public boolean check() {
        System.out.print("Enter your number: ");
        user = keys.nextInt();
        c1 = user % 3;
        c2 = user % 4;
        c3 = user % 5;
        c4 = user % 6;

        if(c1 == 1 || c2 == 1 || c3 == 1 || c4 ==1) {
            return true;
        }
        return false;
    }

        public void count() {
        for (int i = 6; i <= user; i++) {
            if (check() == true) {
                counter ++;
                System.out.print("Your number of cool numbers are " + counter);

            }
        }

        

        }


        
    }



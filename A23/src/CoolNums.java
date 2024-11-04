import java.util.Scanner;

public class CoolNums {
    
    public boolean check(int num) {
        int c1 = num % 3;
        int c2 = num % 4;
        int c3 = num % 5;
        int c4 = num % 6;

        if(c1 == 1 && c2 == 1 && c3 == 1 && c4 ==1) {
            return true;
        }
        return false;
    }

        public void count(int stop) {
            int counter = 0;

            for (int i = 6; i <= stop; i++) {
                if (check(i)) {
                    counter ++;
                }
            System.out.print("Your number of cool numbers are " + counter);
        }

        

        }


        
    }



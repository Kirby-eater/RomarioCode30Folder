import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        int num = 0;
        int i = 0;
        int store = 0;
        int store2 = 0;

        while(i < 3) {
        System.out.println("Enter bowling score(-1 to end): ");
        num = keys.nextInt();
        store += num;
        i++;
        

        if(num >= 200) {
        store += store;
        
        }

        if(num < 200) {
        store2 += store2;
        }

        }
        store = i / store;
        System.out.println("Elite bowlers " + store);

        store2 = store2 / i;
        System.out.println("Average bowler " + store2);

    }

            

    
}


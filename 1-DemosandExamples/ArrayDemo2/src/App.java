import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int[] nums = null; // Declare the array

        System.out.println("How many number ");
        int SIZE = inp.nextInt();
        
        
        nums = new int[SIZE];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Please enter an integer: ");
            nums[i] = inp.nextInt();


        }

        System.out.print("your list of numbers is: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ",");
        }

        // Output the last value WITH a new line
        System.out.println(nums[nums.length-1] + ",");


    }
}

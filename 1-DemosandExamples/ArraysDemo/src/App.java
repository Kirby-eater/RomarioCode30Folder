public class App {
    public static void main(String[] args) throws Exception {
        // declare the arry
        // int[] scores = null;
        // String[] names = null;
        
        // create or intialize array
        // scores = new int[10];
        // names = new String[10];

        // Assign Values of Array
        // List of data (solution set)
        String[] names = {"Wolf", "Sutter", "Cook", "Fox", "Golden"};
        int[] scores = {9000, 7001, 1337, 2048, 4096};

        // Individual positions
        names[0] = "Wolf";
        scores[0] = 9000;

        // Array Length Property
        System.out.println("Scores length is " + names.length);

        // Outputting or Accessing Arrays
        for(int i = 0; i < names.length; i++) {
            System.out.println(i + ") "+ names[i] + ": " + scores[i]);
        }

        // Ouput in reverse order
        for(int i = 4; i < names.length; i--) {
            System.out.println(i + ") "+ names[i] + ": " + scores[i]);
        }
        
        //Find the sum of the array
        int sum = 0;
        for(int i = 0; i < names.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("The sum is " + sum);

        // Count elements of an array (eg. even numbers)
        int count = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] % 2 == 0) {
                count++;
            }
        }

    }
}

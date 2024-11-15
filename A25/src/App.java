// Project Name: Random Numbers
// Name: Romario Bonnick
// Date: 15 November 2024
// Description: generates two random integers, and compares them

public class App {
    public static void main(String[] args) throws Exception {
        RandomGen com = new RandomGen();
        int count = 0;

        while(count < 10) {
        com.compare();
        System.out.println();
        count++;
    }
}
}

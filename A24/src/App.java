// Project Name: Loop Stats
// Name: Romario Bonnick
// Date: 4 November 2024
// Description: Run a loop from a provided start number to a provided stop number.   Total up all numbers in the group, determine all odds in the group, and determine all evens in the group.

public class App {
    public static void main(String[] args) throws Exception {
        Looper count = new Looper();

        count.getEvenCount(10);
        count.countev(10);
        count.getOddCount(10);
        count.countodd(10);
        count.getTotal();
    }
}

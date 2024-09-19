// Project Name: Wing Calculator
// Name: Romario Bonnick
// Date: 19 September 2024
// Description: Calculating how many wings you can purchase




public class App {
    public static void main(String[] args) throws Exception {
        int wings;
        double moneyHave;
        double cost;

        moneyHave = 4.75;
        cost = 0.75;
        wings = (int)(moneyHave / cost);
        
        System.out.println("You can get " + wings + " wings with the money you have now");
    }
}

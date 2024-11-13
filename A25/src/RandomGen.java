
public class RandomGen {
    double num1 = 0;
    double num2 = 0;

    public void compare() {
        num1 = Math.random() * 20 + 7;
        num2 = Math.random() * 20 + 7;

        System.out.println("Here are two random numbers:");
        System.out.println(num1 + " and " + num2);

        if(num1 > num1) {
            System.out.print("The greatest is " + num1 + "and the smallest is " + num2);
        }

        else { //(num2 > num1)
            System.out.print("The greatest is " + num2 + "and the smallest is " + num1);
        }
    }

}

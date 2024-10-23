public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        int y = 5;
        // && = and
        // || = or

        if (x < 0) {
            System.out.println("x is negative");
        }

        else if (x == 0) {
            System.out.println("x is zero");
        }

        else {
            System.out.println("x is positive");
        }

        if (x > 0) {
            if (x > y) {
            System.out.println("x is positive and greater than " + y);
        }
    }
        // Equivilant
    if (x > 0 && x > y) {
        System.out.println("x is positive and greater than " + y);
    }

    // Else if and The or Statement

    if (x < 0) {
        System.out.println("Not a winner");
    }
    else if {
        System.out.println("Not a winner");
    }
    else {
        System.out.println("This is a winning number");
    }

    // Equivilant
    if (x < 0 || x > 5) {
        System.out.println("Not a winner");
    }
    else {
        System.out.println("Winner");
    }
    }
}

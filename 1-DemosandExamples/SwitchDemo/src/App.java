import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int option = 0;

        System.out.println("Please select a number");
        option = inp.nextInt();

        // if(option == 7) {
        //     System.out.println("You selected 7, cool!");
        // }

        // if(option == 6) {
        //     System.out.println("You selected 6, cool!");
        // }

        // if(option == 5) {
        //     System.out.println("You selected 75, cool!");
        // }

        // else {
        //     System.out.println("You picked a weird number");
        // }

                                //OR

        switch(option) {
            case 7:
                System.out.println("You picked 7!");
                break;

            case 6: 
                System.out.println("You picked 6!");
                break;

            case 5:
                System.out.println("You picked 5!");
                break;

            default:
                System.out.println("You picked a wieird number");
                break;


        }


    
    }
}

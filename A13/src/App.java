// Project Name: Geometry Calculator
// Name: Romario Bonnick
// Date: 16 October 2024
// Description: Calculating perimeter, surface area, and area of a circle

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Submethod calc = new Submethod();
        Scanner keys = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("Perimeter of a Rectangle = 1:");
        System.out.println("Surface area of a cube = 2:");
        System.out.println("Area of a Circle = 3:");
        System.out.println("What would you like to do (1/2/3)?");
        choice = keys.nextInt();

        
        if (choice == 1) {
            calc.perimeter();
        }

        if (choice == 2) {
            calc.SurfaceArea();
        }

        if (choice == 3) {
            calc.AreaCircle();
        }

    keys.close();
    
    
    }
    
}

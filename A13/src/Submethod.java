import java.util.Scanner;

public class Submethod {
   private Scanner keys = new Scanner(System.in);
    private double ans =0;
    private double len =0;
    private double wid =0;
    private double sid =0;
    private double rad =0;


    public void perimeter() {
     System.out.print("Enter your length: ");
     len = keys.nextDouble();
     System.out.print("Enter your width: ");
     wid = keys.nextDouble();
     ans = (2*len) + (2*wid);
     System.out.println("Your Perimeter is " + ans);


    }

    public void SurfaceArea() {
     System.out.print("Enter your side length: ");
     sid = keys.nextDouble();
     ans = 6 * (sid * sid);
     System.out.println("Your Surface Area is " + ans);


    }


    public void AreaCircle() {
     System.out.print("Enter your radius: ");
     rad = keys.nextDouble();
     ans = Math.PI * (rad * rad);
     System.out.println("The Area of the circle is " + ans);


    }

}

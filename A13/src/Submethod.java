import java.util.Scanner;

public class Submethod {
   private Scanner keys = new Scanner(System.in);
    private double ans =0;
    private double len =0;
    private double wid =0;
    private double sid =0;
    private double rad =0;





    public void perimeter() {
     System.out.print("Enter you length: ");
     len = keys.nextDouble();
     System.out.print("Enter you width: ");
     wid = keys.nextDouble();
     ans = (2*len) + (2*wid);
     System.out.println("Your Perimeter is " + ans);



    }

    public void SurfaceArea() {
     System.out.print("Enter you side length: ");
     sid = keys.nextDouble();
         ans = 6 * (sid * sid);
         System.out.println("Your Surface Area is " + ans);


    }


    public void AreaCircle() {
         ans = Math.PI * (rad * rad);


    }

}

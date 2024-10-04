public class SubMethods {
    private double ans = 0;

    public void output() {
        System.out.println(ans);
        System.out.printf("%8.3f",ans);
        
        //%f - real/decimal value
        //%d - integer value
        //%c - character value
        //%s - string value
    }

    public void calc(int a, int b) {
        ans = (a * b)/1.769876547857449805;
        

    }
}

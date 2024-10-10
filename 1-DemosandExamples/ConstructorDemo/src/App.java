public class App {
    public static void main(String[] args) throws Exception {
        SubMethod test = new SubMethod();
        int num = test.myFuction();

        System.out.println("The return is" + num );
    }

    private void myName() {
        System.out.println("my name is FOX");
    }
}

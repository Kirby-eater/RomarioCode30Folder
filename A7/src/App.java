// Project Name: String Basics
// Name: Romario Bonnick
// Date: 20 September 2024
// Description: coding to remove and change words in code




public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";
        int length1 = target1.length();
        int one = message1.indexOf(target1);
        System.out.println(message1.replace("very","" ));
        


        String message2 = "That was great - lol.";
        String target2 = "lol";
        int length2 = target2.length();
        int two = message2.indexOf(target2);
        System.out.println(message2.replace("lol","laugh out loud"));

    }
}

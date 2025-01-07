import java.util.*;

public class Raffle {
    
    public void Mixer() {
    Scanner keys = new Scanner(System.in);

    //String[] names = null;
    String user = keys.next();

    
    //names = new String[12];

    String[] names = {user, "Wolf", "Sutter", "Cook", "Fox", "Golden", "Sally", "Riley", "Wompus", "Raff"};

    double pick;
    pick = names.length;
    pick = Math.random();



    System.out.println(pick);

}

}

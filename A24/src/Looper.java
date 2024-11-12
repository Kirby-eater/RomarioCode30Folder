public class Looper {

    int start = 0;
    int stop = 10;
    
    
    

    public boolean getEvenCount(int stop) {
        int even = stop % 2;

        if(even == 0 ) {
        
        return true;

    }
        return false;
}

    public void countev(int stop) {
        int ecount = 0;

        for(int i = 0; i <= stop; i++) {
            if (getEvenCount(i)) {
                ecount ++;
            }
            
        }
        System.out.println("The number of even numbers is " + ecount);
    }


 
     public boolean getOddCount(int stop) {
         
         int odd = stop % 2;

         if(odd == 0) {
            return true;
         }
		 
		 return false;
	 }
     public void countodd(int stop) {
        int odcount = 0;

        for(int i = 0; i <= stop; i++) {
            if (getOddCount(i)) {
                odcount ++;
            }
        }
    
        System.out.println("The number of odd numbers is " + odcount);
    }
 
	 
     public void getTotal() {
		 int total=0;
         total = (0+1+2+3+4+5+6+7+8+9+10);


    System.out.print("The total of the numbers are " + total);
	 }


}
import java.util.Arrays;

public class Arrayss {
    int[] nums = null;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int sum1 = 0;
    int sum2 = 0;

    public void Out1() {

        nums = new int[12];
        int[] nums = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        System.out.println(Arrays.toString(nums));

        
        sum1 = nums[3] + nums[4] + nums[5] + nums[6];
         System.out.println("Sum of spots 3-6 = " + sum1);

        sum2 = nums[2] + nums[3] + nums[4] + nums[5] + nums[6] + nums[7] + nums[8] + nums[9];
        System.out.println("Sum of spots 2-9 = " + sum2);

        for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 4) {
            count1++;
            
        }
    }
    System.out.println("# of 4s = "+ count1);


    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 9) {
            count2++;
            
        }
    }
    System.out.println("# of 9s = "+ count2);

    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 7) {
            count3++;
            
        }
        
    }
    System.out.println("# of 7s = "+ count3);


    }

    public void Out2() {

        nums = new int[27];
        int[] nums = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        System.out.println(Arrays.toString(nums));

        
        sum1 = nums[3] + nums[4] + nums[5] + nums[6] +  nums[7] + nums[8] + nums[9] + nums[10] +  nums[11] + nums[12] + nums[13] + nums[14] +  nums[15] + nums[16];
         System.out.println("Sum of spots 3-16 = " + sum1);

        sum2 = nums[2] + nums[3] + nums[4] + nums[5] + nums[6] + nums[7] + nums[8] + nums[9];
        System.out.println("Sum of spots 2-9 = " + sum2);

        for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 0) {
            count1++;
            
        }
    }
    System.out.println("# of 0s = "+ count1);


    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 3) {
            count2++;
            
        }
    }
    System.out.println("# of 3s = "+ count2);

    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 7) {
            count3++;
            
        }
        
    }
    System.out.println("# of 7s = "+ count3);
    }

}

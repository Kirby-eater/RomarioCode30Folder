import java.util.Arrays;

public class Arrayss {
    int[] nums = null;
    int count = 0;
    int sum1 = 0;
    int sum2 = 0;

    public void Out1() {

        nums = new int[12];
        int[] nums = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        System.out.println(Arrays.toString(nums));

        
        sum1 = nums[3] + nums[4] + nums[5] + nums[6];
         System.out.println(sum1);

        sum2 = nums[2] + nums[3] + nums[4] + nums[5] + nums[6] + nums[7] + nums[8] + nums[9];
        System.out.println(sum2);


    }

}

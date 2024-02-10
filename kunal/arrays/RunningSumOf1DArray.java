package kunal.arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        int[] arr = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            int ans = sum(i, nums);
            arr[i] = ans;
        }
        arr[0] = nums[0];
        System.out.println(Arrays.toString(arr));

        //-----------------------------------------------------------------------------------
        // @2nd optimal solution

        int[] num = {1, 1, 1, 1, 1, 1};
        for (int i = 1; i < num.length; i++) {
            num[i] += num[i - 1];
        }
        System.out.println(Arrays.toString(num));


        //-----------------------------------------------------------------------------------
        // @3rd optimal solution
        int arrs[]={3,1,2,10,1};
        int sum=0;
        for (int i = 0; i < arrs.length; i++) {
            sum=sum+arrs[i];
            arrs[i]=sum;
        }
        System.out.println(Arrays.toString(arrs));
    }

    private static int sum(int end, int[] nums) {
        int sum = 0;
        for (int j = 0; j <= end; j++) {
            sum = sum + nums[j];

        }
        return sum;
    }

}

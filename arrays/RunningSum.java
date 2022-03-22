package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSum runningSum= new RunningSum();
        int[] nums ={1,2,4,5,6};
        int[] ints = runningSum.runningSum(nums);
        Arrays.stream(ints).forEach(System.out::println);

    }
}
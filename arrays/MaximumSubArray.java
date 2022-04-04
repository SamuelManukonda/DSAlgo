package arrays;

public class MaximumSubArray {
// https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        //int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
        int nums[]={5,-4,-2,6,-1};
        //int sum=findTheSumOfSubArray(nums);
        System.out.println(findtheSum(nums));
       // System.out.println(sum);
    }

    private static int findtheSum(int[] nums) {
        // So we basically ignore the negative total.
        int bestSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            // we need compare the sum and the next element and consider which is better
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            // update the bestSum with the value which we received as cuurentSUM
            bestSum=Math.max(currentSum,bestSum);

        }
        return bestSum;
    }


    private static int findTheSumOfSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum= currentSum + nums[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(maxSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}

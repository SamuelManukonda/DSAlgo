package arrays;

public class MinimumSumSubArray {

    public static void main(String[] args) {
        int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
        //int nums[]={5,-4,-2,6,-1};
        System.out.println("Order of n "+findtheSum(nums));
        System.out.println("Brute force "+ findTheSumBruteForce(nums));
    }

    // Kadens algo
    private static int findtheSum(int[] nums) {
        int bestSum=Integer.MAX_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            // we need compare the sum and the next element and consider which is better
            currentSum=Math.min(nums[i],currentSum+nums[i]);
            // update the bestSum with the value which we received as cuurentSUM
            bestSum=Math.min(currentSum,bestSum);

        }
        return bestSum;
    }

    // Run the array two times and calculate the sum of each subarray and find the Math.max of currentsum
    private static int findTheSumBruteForce(int[] nums) {
        int minSum=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum=0;
            for(int j=i;j<nums.length;j++){
                // Calculate the sum at each point of time and later compare which is the max value
                currentSum=currentSum+nums[j];
                minSum=Math.min(minSum,currentSum);
            }

        }
        return minSum;
    }
}

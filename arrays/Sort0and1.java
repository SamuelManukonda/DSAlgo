package arrays;

import java.util.Arrays;

public class Sort0and1 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 1, 1, 1, 0, 0};
        int[] ans = sortArrayTwoPointer(nums);
        int[] sorted = sortArrayApproach2(nums);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(sorted));
    }

    private static int [] sortArrayApproach2(int[] nums) {
        int count=0;
        // Count the number of 0's in the array
        for(int i=0;i< nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        // Replace the first side of array with 0 as you now know the count of 0's
        for (int i = 0; i <=count; i++) {
            nums[i]=0;
        }
        // Replace the count to n-1 elements with 1 in the array.
        for (int i = count; i < nums.length; i++) {
            nums[i]=1;
        }
        return nums;
    }

    private static int[] sortArrayTwoPointer(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            // Algorithm: if you find the 0 or 1 just increment i or j accordingly
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }
            // if the order is not correct then swap the numbers and increment the indexes.
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            }
        }

        return nums;

    }
}

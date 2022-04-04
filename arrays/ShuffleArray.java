package arrays;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/submissions/
public class ShuffleArray {

    public static void main(String[] args) {
        int nums[]={2,5,1,3,4,7};  // 2,3,5,4,1,7
        int n=3;
        int arr[]=shuffleArray(nums,n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static int[] shuffleArray(int[] nums, int n) {
        int result[]=new int[nums.length];
        for(int i=0,j=3,k=0;i<nums.length-n && j<nums.length && k<nums.length;i++,j++,k=k+2){
            result[k]=nums[i];
            result[k+1]=nums[j];
        }
        return result;
    }


}

package arrays;

//https://leetcode.com/problems/binary-search
public class BinarySearch {

    public static void main(String[] args) {
        int nums[] ={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,target));
    }
    public  static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            // find the middle element
            int mid=start+(end-start)/2;
            // if the middle element is the target then return that index
            if(nums[mid]==target){
                return mid;
            }// If the middle element is greater than the target then the target is on the left side of the arry for we decrease the index of end
            else if(nums[mid]> target){
                end=mid-1;
            }else{
                // if middle is less than target then the target is on the right of array so we increase the start index
                start= mid+1;
            }
        }
        return -1;

    }
}

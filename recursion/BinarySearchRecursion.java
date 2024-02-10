package recursion;


public class BinarySearchRecursion {

    public static void main(String[] args) {
        int arr[]={1,3,6,66,67,96,103};
        int target=3;
        int start=0;
        int end=arr.length-1;
        int i = binarySearch(arr, target, start, end);
        System.out.println(i);
    }

    private static int  binarySearch(int[] nums, int target, int start, int end) {

        if(start>end){
            return -1;
        }
        int mid=start+ (end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return binarySearch(nums,target,start,mid-1);
        }
        else{
            System.out.println(start);
            return binarySearch(nums,target,start+1,end);
        }
    }
}

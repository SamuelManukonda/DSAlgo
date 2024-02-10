package arrays;

// https://leetcode.com/problems/monotonic-array/solution/
public class MonotonicArray {
    public static void main(String[] args) {
        int nums[]  ={1,2,3,4,5};
        //int[] nums ={ 6,6,5,4,3,2,2,1};
        boolean flag=isMonotonic(nums);
        System.out.println(flag);
    }

    private static boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]) increasing=false;
            if(nums[i] > nums[i+1]) decreasing=false;
        }
        return increasing || decreasing;

    }
}

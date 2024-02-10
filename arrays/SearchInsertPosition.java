package arrays;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        int i = searchInsert(arr, target);
        System.out.println(i);

    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (target > nums[start]) {
            return start + 1;
        } else return start;

    }

}



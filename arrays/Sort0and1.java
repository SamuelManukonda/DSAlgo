package arrays;

import java.util.Arrays;

public class Sort0and1 {

    private static int j;

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 0, 1, 1, 1, 0, 0};
        int[] ans = sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }
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

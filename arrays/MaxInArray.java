package arrays;

public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = {1, 86, 2, 5, 43, 54, 98, 101};
        System.out.println(maxNumber(arr));
    }

    private static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            //max = Math.max(max, arr[i]);
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }

}

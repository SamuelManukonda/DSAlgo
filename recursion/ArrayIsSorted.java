package recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 7, 20};
        System.out.println(isSorted(arr));

    }

    static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        // Base condition if we reach the last element means array is sorted/
        if(index == arr.length-1) return true;
        return arr[index] < arr[index+1] && helper(arr,index+1);

    }


}

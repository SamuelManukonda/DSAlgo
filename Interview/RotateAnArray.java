package Interview;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {

        int [] arr={1,3,5,6,7,8};
        int n=3;
        // expected output
        // 6,7,8,1,3,5
        int start=0;
        int end= arr.length-1;

        // rotate the entire array
        int[] rotateArray = rotateArray(arr, start, end);
        // rotate 0 to n
        int[] firstRotate = rotateArray(rotateArray, 0, n-1);
        int[] finalArray = rotateArray(firstRotate, n, arr.length - 1);
        Arrays.stream(finalArray).forEach(System.out::println);

    }

    private static int[] rotateArray(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }
}

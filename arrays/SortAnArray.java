package arrays;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int arr[]={2,4,3,1,5};
        int[] sort = sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    private static int[] sort(int[] arr) {

        for(int i=1;i<arr.length;i++){

            while(i>0 && arr[i-1]>arr[i]){
                arr[i]=arr[i-1];
                arr[i]=arr[i];
            }
        }
        return arr;
    }
}

package arrays;


import java.util.*;

public class InPlaceSortWithPositiveElements {

    public static void main(String[] args) {
        int[] arr ={ 6,1,2,3,4,5};
        int n= arr.length-1 ;
        int i=0;

        while(i<n){
            if(arr[i]>=n||arr[i]==i+1){
                i++;
            }else{
                int correctIndex=arr[i]-1;
                swap(correctIndex,i,arr);
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int correctIndex, int i, int[] arr) {
        int temp= arr[correctIndex];
        arr[correctIndex]=arr[i];
        arr[i]=temp;


    }
}

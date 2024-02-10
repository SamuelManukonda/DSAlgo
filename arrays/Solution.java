package arrays;

public class Solution {
    public int[] solve(int[] A) {
        quickSort(A,0,A.length-1);
        return A;

    }
    public static void quickSort(int []arr, int start, int end){

        if(start>=end) return;
        int pivotIndex = partition(arr,start, end);
        quickSort(arr, start , pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
    }
    public static int partition(int [] A, int s , int e){
        int pivot = A[e];
        int i = s-1;
        for( int j=s; j<=e-1; j++){
            if(A[j]< pivot){
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i, e-1);
        return i+1;
    }
    public static void swap( int arr[], int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}






package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinearSearchInRecursion {

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6,6, 2, 7};
        int target = 6;
        int start = 0;
        //System.out.println(linearSearch(arr, start, target));
        //System.out.println(linearSearchBoolean(arr, start, target));
        List<Integer> answer=linearSearchListReturnType(arr, target, start);
        System.out.println(answer);

    }

    private static List<Integer> linearSearchListReturnType(int[] arr, int target, int index) {
    List<Integer> integerList=new ArrayList<>();
        if (index == arr.length - 1){
            return integerList;
        }
        if(arr[index] ==target)  {
            integerList.add(index);
        }
        List<Integer>  ansFromBelowFunctionCalls= linearSearchListReturnType(arr, target, index + 1);

       integerList.addAll(ansFromBelowFunctionCalls);
        return integerList;
    }

    static int linearSearch(int arr[], int index, int target) {

        if (index == arr.length - 1) return -1;

        if (arr[index] == target) return index;


        return linearSearch(arr, index + 1, target);
    }

    static boolean linearSearchBoolean(int arr[], int index, int target) {
        if (index == arr.length - 1) return false;
        return arr[index] == target || linearSearchBoolean(arr, index + 1, target);
    }
}

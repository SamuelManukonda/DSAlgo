package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5};
        // removeDuplicatesUsingCollections(arr);
        removeDuplicates(arr);
    }

    private static void removeDuplicatesUsingCollections(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        Arrays.stream(arr).forEach(integerSet::add);
        integerSet.forEach(System.out::println);
    }

    private static void removeDuplicates(int[] arr) {
       if(arr.length==0) System.out.println("Array is empty");
       int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

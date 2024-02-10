package kunal.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the numbers");
        // adding elements to the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }
//
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
        for(int [] row: arr){
            System.out.println(Arrays.toString(row));
        }
    }



}

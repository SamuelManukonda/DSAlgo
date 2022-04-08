package arrays;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
// https://www.youtube.com/watch?v=ZFgJrfbaXT8
public class PascalTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = drawTriangle(numRows);
        triangle.forEach(System.out::println);
    }

    // Explanation
//    row   Index
//    1     0
//    2     1
//    3     2
//    4     3
//    5     4


//             1 - row 1 - index -0
//            1 1 -row 2 -index 1
//            1 2 1 -row 3  -index 2
//            1 3 3 1 - row 4 -index 3
//            1 4 6 4 1 - row 5 -index 4
//            1 5 10 10 5  1 - row 6 -index 5
    private static List<List<Integer>> drawTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>(); // create a new row everytime.
            for (int j = 0; j < i; j++) { // j should be less than i because of array out of bound
                if (j == 0 || j == i - 1) { // if j is first element or last element just add 1
                    row.add(1);
                } else {
                    // we need to get previous index in the added list and add n and n-1
                    // To get the previous index we need to i-2 because see above
                    // apart from 1st element other are done this way.
//                    1--- 0+1
//                    2----1+2
//                    3----2+3
                    row.add(ans.get(i - 2).get(j) + ans.get(i - 2).get(j - 1));
                }

            }

            ans.add(row);
        }
        return ans;
    }

}

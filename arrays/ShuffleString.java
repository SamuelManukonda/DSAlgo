package arrays;

// https://leetcode.com/problems/shuffle-string
//You are given a string s and an integer array indices of the same length.
// The string s will be shuffled such that the character
// at the ith position moves to indices[i] in the shuffled string.

//Return the shuffled string.


public class ShuffleString {

    public static void main(String[] args) {
        String s="codeleet";
        int[] indices ={4,5,6,7,0,2,1,3};
        
        String shuffle=shuffleString(s,indices);
        System.out.println(shuffle);
    }

    private static String shuffleString(String s, int[] indices) {
        char [] result=new char[indices.length];
        for(int i=0;i<indices.length;i++) {

            char element = s.charAt(i); // character ar ith location
            int index = indices[i];// get the index of indices
            result[index] = element; // replace the element.
        }
        return String.valueOf(result);
    }
}

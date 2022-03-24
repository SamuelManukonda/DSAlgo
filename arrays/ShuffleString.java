package arrays;

// https://leetcode.com/problems/shuffle-string/submissions/
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
            char element = s.charAt(i);
            int index = indices[i];
            result[index] = element;
        }
        return String.valueOf(result);
    }
}

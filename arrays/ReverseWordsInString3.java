package arrays;

import java.util.Arrays;

public class ReverseWordsInString3 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String ans="";
        for(int i=0;i< s1.length;i++){
            String rev= reverseCharacters(s1[i]);
            ans=ans+" "+rev;
        }
        return ans;


    }

    private static String reverseCharacters(String s) {
        char[] chars = s.toCharArray();

        int start =0;
        int end=chars.length-1;
        String rev="";
        while(start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}

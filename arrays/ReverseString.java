package arrays;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String str="reverse";
        System.out.println(reverseString(str));

    }

    private static String reverseString(String str) {
        char [] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while (start<=end){
            char temp=ch[end];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
}

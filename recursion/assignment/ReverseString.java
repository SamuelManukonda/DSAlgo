package recursion.assignment;

public class ReverseString {

    public static void main(String[] args) {

    reverseString("hello is new");
    }

    public static void reverseString(String str) {
        char[] s = str.toCharArray();
        int start=0;
        int end=s.length-1;
        helper(s, start, end);
        System.out.println(s);
    }

    static void helper(char[] s, int start, int end){
        if(start>end) return;
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        helper(s,start+1,end-1);
    }


}

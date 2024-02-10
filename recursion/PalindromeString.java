package recursion;

public class PalindromeString {

    public static void main(String[] args) {
//        String s="snoons";
//        System.out.println(isPalindrome(s));
        String str="radar";
        int start=0;
        int end=str.length()-1;
        System.out.println(isPalindromeRecursion(str,start,end));

    }
    // Take two pointers and check each index everytime and return the boolean based on the match found
    static boolean isPalindrome(String str){
        int s=0;
        int e=str.length()-1;
        while (s<e){
           if(str.charAt(s) == str.charAt(e)){
               return true;
           }
           s++;
           e--;
        }
        return false;

    }

    // Same logic iterate until the case fails and call the same function again.
    static boolean isPalindromeRecursion(String str,int start, int end){

        if(start>=end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursion(str,start+1,end-1); // f(n)= f(n ,start+1, end-1)


    }
}

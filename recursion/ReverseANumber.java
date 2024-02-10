package recursion;

public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(435221));
    }

    static int reverseNumber(int num) {
        // 1834 ==> 4
        int noOfDigits = (int) (Math.log10(num)) + 1;
        // for some cases we need to create helper functions, so we need to create helper function and add additional arguments
        return helper(num, noOfDigits);

    }

    private static int helper(int num, int digits) {
        // base condition
        if(num%10 ==0){
            return num;
        }
        int remainder = num % 10;
        // f(n)= remainder + 10^digits-1  i.e 10^1000 + f(n/10, digits)
        // This means get the last element and multiply with 10^n-1 and remove the last digit by n/10 and then pass the digits
        int i = remainder * (int) Math.pow(10, digits - 1) + helper(num / 10, digits - 1);
        return i;

    }
}

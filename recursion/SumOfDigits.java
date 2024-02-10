package recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int sum = sumOfDigits(1234);
        System.out.println(sum);
    }

    static int sumOfDigits(int n){
        if(n==0) {
            return 0;
        }
        //Modulo gives the remainder i.e last element in the number 1234%10 =4

        int remainder=n%10;
        // Division removes the last element.
        // 1234/10 = 123
        return remainder+sumOfDigits(n/10); // f(n) = remainder + f(n/10)
    }
}

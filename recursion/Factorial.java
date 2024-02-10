package recursion;

public class Factorial {

    public static void main(String[] args) {
        long num=5;
        long factorial = factorial(num);
        System.out.println(factorial);
    }

    static long factorial(long num){
        if(num<=1){
            return 1;
        }
        long l = num * factorial(num - 1);// f(N)= Num* f(N-1)
        return l;
    }
}

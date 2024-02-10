package recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int fibo = fibo(4);
        System.out.println(fibo);
    }

    private static int fibo(int num) {
        if(num<2){
            return num;
        }
        return fibo(num-1)+ fibo(num-2); // f(n)= f(n-1) + f(n-2)
    }
}

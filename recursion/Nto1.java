package recursion;

public class Nto1 {
    public static void main(String[] args) {
        int num = 5;
        //printNum(num);
        printNumRev(num);
    }

    private static void printNumRev(int num) {
        if (num == 0) {
            return;
        }
        printNumRev(num - 1);
        System.out.println(num);
    }

    static void printNum(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1); // f(n)= f(n-1)

    }
}

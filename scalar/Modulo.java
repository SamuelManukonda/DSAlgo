package scalar;

public class Modulo {

    public static void main(String[] args) {
        // 3^100 %10
        int a=2;
        int b=300;
        int m=10;
        int ans = 1;
        System.out.println(modulo(a,b,m,ans));


    }

    private static int modulo(int a, int b, int m, int ans) {
        for(int i=a;i<=b;i++ ){
            ans= (ans*a)%m;
        }
        return ans;
    }
}

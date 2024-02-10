package recursion;

public class NoOfZeros {

    public static void main(String[] args) {

        System.out.println(countZeros(301040));
    }
    static  int count=0;
    static int countZeros(int n){
        return helper(n, count);
    }

    private static int helper(int n, int count) {
        if(n/10 ==n){
            return count;
        }

        int remainder=n%10;
        if(remainder ==0) return helper(n/10,count+1);
        return helper(n/10,count);

    }
}

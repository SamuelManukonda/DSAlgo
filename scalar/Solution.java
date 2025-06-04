package DSAlgo.scalar;

public class Solution {
    public static void main(String[] args) {
        solve(19);
    }
    public static int solve(int A) {

        int count=0;
        for(int i=1;i<=A;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>1) return false;
        else return true;

    }
}


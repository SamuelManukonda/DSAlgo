package arrays;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int arr[]={9, -20, -11, -8, -4, 2, -12, 14, 1 };
        int ans[]= new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

package arrays;

// https://leetcode.com/problems/richest-customer-wealth/submissions/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][]accounts = {{1,5},{7,3},{3,5}};
        int max=findMax(accounts);
        System.out.println(max);
    }

    private static int findMax(int[][] accounts) {
        int max=0;
        for (int[] account:accounts) {
            int sum=0;
            for (int wealth:account) {
                sum=sum+wealth;
            }
             max = Math.max(sum, max);
        }
        return max;
    }
}

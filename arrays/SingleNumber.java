package arrays;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        int []arr={4,1,2,1,2};
        int num=findTheSingleNumber(arr);
        System.out.println(num);
    }

    private static int findTheSingleNumber(int[] arr) {
      int ans=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]!=arr[j]){
                    ans=arr[i];
                    break;
                }
            }
        }
        return ans;
    }


}

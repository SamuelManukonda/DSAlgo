package Interview;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr ={3,0,1};
        int missing = findMissing(arr);
        System.out.println(missing);
    }

    private static int  findMissing(int[] arr) {
        int n=arr.length;
        int total = (n * (n + 1)) / 2;
        int sum=0;
        for(int val:arr){
            sum=sum+val;
        }
        return total-sum;
    }

}

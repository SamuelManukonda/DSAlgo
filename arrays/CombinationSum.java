package arrays;

public class CombinationSum {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7};
        int target = 7;
        findCombination(arr, target);
    }

    private static void findCombination(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(target-arr[i]>=0){
                findCombination(arr,target-arr[i]);
            }

        }
    }

}

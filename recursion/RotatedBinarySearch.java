package recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 9, 1, 3, 4};
        int target = 11;
        int end = arr.length - 1;
        int start = 0;

        System.out.println(rotatedBinarySearch(arr, start, end, target));

    }

    static int rotatedBinarySearch(int arr[], int s, int e, int target) {

        if (s>=e) return -1;

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) return mid;

        // if mid element is greater than start, that means array from start to mid is sorted
        if (arr[s] <= arr[mid]) {
            //this means the array is sorted and lies between start and mid so we do end=end-1
            //example [5, 6, 7, 9, 1, 3, 4] target =7 mid =9 start =0
            if (target >= arr[s] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, s, mid - 1, target);
            } else {
                // if above is false the target is in other half of array. so start= mid+1
                return rotatedBinarySearch(arr, mid + 1, e, target);
            }
        }
        // ex [5, 6, 1, 2 ,3 , 4, 5] target=2 mid =arr[2]
        // If target is greater than mid and less than end means this part of array is sorted and we do start=mid+1
        if (target >= arr[mid] && target <= arr[e]) {
            return rotatedBinarySearch(arr, mid + 1, e, target);
        } else {
            // else it is on other half of the array so we do end=mid-1
            return rotatedBinarySearch(arr, s, mid - 1, target);
        }


    }
}

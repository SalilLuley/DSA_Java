package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,20,30,40,50,60,100};
        int target = 101;
        int ceilingIndex = cealing(arr, target);
        System.out.println(ceilingIndex >= arr.length ? -1 : arr[ceilingIndex]);


    }
    //Find the ceiling of a number
    // eg arr = [1,2,3,5], target = 4, return 5
    static int cealing(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    };

}

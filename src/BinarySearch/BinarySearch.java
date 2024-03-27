package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,12,18,28,29,30,35,36,40,45,};
        int target = 3;

        System.out.println(binarySearch(arr, target));
//        int ceilingIndex = cealing(arr, target);
//        System.out.println(arr[ceilingIndex]);
//
//        int floorIndex = floor(arr, target);
//        System.out.println(arr[floorIndex]);

    }
    static int binarySearch(int[] arr, int target){
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
        return -1;
    };

    //Find the ceiling of a number
    // eg arr = [1,2,3,5], target = 4, return 5
    static int cealing(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    };

    //Find the floor of a number
    // eg arr = [1,2,3,5], target = 4, return 3
    static int floor(int[] arr, int target){
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
        return end;
    };

}

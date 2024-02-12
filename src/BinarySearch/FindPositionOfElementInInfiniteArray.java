package BinarySearch;

public class FindPositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,16,17,19,20};
        int target = 3;
        int output = ans(arr, target);
        System.out.println(output);
    }

    public  static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;
        //Condition for target to lie in range is target > end
        while (target > arr[end]) {
            int temp = end + 1; //this is my new start
            //new end = sizeof box +2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        //First occurrence
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
               return mid;
            }
        }
        return -1;
    }


}

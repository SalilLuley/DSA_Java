package BinarySearch;

//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};

        int output = ans(arr);
        System.out.println(output);
    }

    public  static int ans(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        //First occurrence
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

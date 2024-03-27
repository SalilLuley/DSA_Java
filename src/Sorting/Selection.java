package Sorting;

import java.util.Arrays;


public class Selection {
//    Steps
//    Figure out min element in array

    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int minNumber = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < minNumber) {
                    minIndex = j;
                    minNumber = arr[j];
                }
            }
            if(minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = minNumber;
            }
        }
    }
    public static void main(String[] args) {
        Selection selection = new Selection();
        int[] arr = {8,9,4,2,1,0};
        selection.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

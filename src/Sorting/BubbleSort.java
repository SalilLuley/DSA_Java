package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[]arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {8,2,6,1,5};
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class AdjacentArray {

    public static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr, int n)
    {
        int var1 = 0;
        for(int i = 0 ; i < arr.size() - 1; i ++) {
            if ((Objects.equals(arr.get(i), arr.get(i + 1))) || (Objects.equals(arr.get(i + 1), arr.get(i + 2)))) {
                int temp = arr.get(i +1);
                arr.set(i +1, arr.get(i + 2));
                arr.set(i + 2, temp);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1,2,2));
        int n = arr.size();
        arr = rearrangeArray(arr, n);
        System.out.println(arr);
    }
}

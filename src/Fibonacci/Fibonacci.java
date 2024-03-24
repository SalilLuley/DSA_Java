package Fibonacci;

import java.util.ArrayList;

public class Fibonacci {



    public ArrayList<Integer> recursive(int length,int n,  ArrayList<Integer> arr) {

        if(length > 0) {
            if(n == 0) {
                arr.add(0);
                return recursive(length - 1, n + 1, arr);
            } else if (n == 1) {
                arr.add(1);
                return recursive(length - 1, n + 1, arr);
            } else {
                int sum = 0;
                sum = arr.get(n - 1) + arr.get(n - 2);
                arr.add(sum);
                return recursive(length - 1, n + 1, arr);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new  Fibonacci();
        ArrayList<Integer> arr = fibonacci.recursive(5, 0, new ArrayList<>());
        System.out.println(arr);

//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            int sum;
//            if (i == 0) {
//               arr.add(0);
//            }else if (i == 1) {
//                arr.add(1);
//            } else {
//                sum = arr.get(i-1) + arr.get(i-2);
//                arr.add((sum));
//            }
//        }
//        System.out.println(arr);
    }
}

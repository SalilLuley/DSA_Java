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
        //Using recursion

//        Fibonacci fibonacci = new  Fibonacci();
//        ArrayList<Integer> arr = fibonacci.recursive(5, 0, new ArrayList<>());
//        System.out.println(arr);

        //Using DP and space optimisation


        int n = 6;
        int nth = 0;
        int prev = 1;
        int next = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 0) nth = 0;
            if (i == 1) nth = 1;
            if (i == 2) {
                nth = 1;
            }

            if (i >= 3) { //3
                nth = prev + next; // 3 = 2 + 1
                prev = next; // 2
                next = nth;        // 3
            }
        }

        System.out.println(nth);
    }
}

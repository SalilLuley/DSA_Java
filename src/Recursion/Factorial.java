package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[scanner.nextInt()];
        int i= 1;
        int fact = 1;
        int n = scanner.nextInt();
        while(fact < n) {
            myArray[i] = fact;
            fact = fact * (i + 1 );
            i++;
        }
        System.out.print("Factorial" + Arrays.toString(myArray));
    }
}


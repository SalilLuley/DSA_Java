package Playground;

import java.util.Arrays;
import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 1};
        sortBinaryArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortBinaryArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Increment left index while we see 0 at left
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Decrement right index while we see 1 at right
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // If left is smaller than right then there is a 1 at left
            // and a 0 at right. Swap arr[left] and arr[right]
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
        //1
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int i =1;
//    int counterStar = 1;
//		while(i <= n){
//        int j = n; // 5
//        while(j > 0) {
//            if(j == counterStar){ // 5 == 1
//                System.out.print("*");
//            } else {
//                System.out.print(j); // 5 4 3 2 1
//            }
//            j--;
//        }
//        counterStar++;
//        System.out.println("");
//        i++;
//    }


//    2

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the number of pairs
//        int numPairs = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character after the integer
//
//        // Iterate through each pair
//        for (int i = 0; i < numPairs; i++) {
//            // Read the pair of integers
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character after the pair
//
//            // Process the pair (e.g., print them)
//
//            //
//            int smaller = Math.min(x,y);
//            int bigger = Math.max(x,y);
//
//            int gcdOfSmaller = 1;
//            int lengthOf = 0;
//            if(bigger % smaller == 0) {
//                lengthOf = smaller;
//            } else {
//                lengthOf = smaller - 1;
//            }
//
//            for (int c = 1; c <= lengthOf ; c++) {
//                if(smaller % c == 0 && bigger % c == 0) {
//                    gcdOfSmaller=c;
//                }
//            }
//
//            System.out.println(gcdOfSmaller);
//            //
//        }
//
//        scanner.close(); // Close the scanner when done

//        Scanner s = new Scanner (System.in);
//        int N = s.nextInt();
//
//
//        int[] a= new int[N];
//        for (int i =0; i<N;i++) {
//            a[i]= s.nextInt();
//        }
//
//        for (int index = 0; index < a.length; index++) {
//            int n = a[index];
//
//            int i = 0;
//            while (i < n){
//                int j = 0;
//                int spaces = i;
//
//                while(spaces > 0){
//                    System.out.print(" ");
//                    spaces--;
//                }
//
//                while (j < n - i){
//                    System.out.print("*");
//                    j++;
//                }
//
//                System.out.println("");
//                i++;
//            }
//        }


//        Scanner s = new Scanner (System.in);
//        int N = s.nextInt();
//
//
//        int[] a= new int[N];
//        for (int i =0; i<N;i++)
//        {
//            a[i]= s.nextInt();
//        }
////        int [] A= new int [N-1];
//
//        for ( int i =0;i<N-1;i++)
//        {
//            if ( a[i]==a[i+1])
//            {
//                System.out.println("false");
//                return ;
//            }
////            A[i]= a[i] -a[i+1];
//        }
//        int i =0;
//        while (i<N-2)
//        {
////            if (A[i]<0 && A[i+1]>0)
////            {
////                System.out.println("false");
////                return ;
////            }
////            i++;
//        }
//        System.out.println("true");

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] numbers = input.split("\\s+");
//
//        int[] sequence = new int[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            sequence[i] = Integer.parseInt(numbers[i]);
//        }
//        scanner.close();
//        boolean isDescending = false;
//        boolean isAscending = false;
//
//        int mid = sequence.length / 2;
//        int i = 0;
//        int start = 1;
//        int end = sequence.length - 1;
//
//        if(start != mid) {
//            while(start < mid){
//                if (sequence[i] > sequence[i+1]){
//                    isDescending = true;
//                } else {
//                    isDescending = false;
//                    break;
//                }
//                start++;
//                i++;
//            }
//
//        } else {
//            isDescending = true;
//        }
//        i = mid;
//        if(isDescending) {
//            if(mid != end) {
//                while(mid < end){
//                    if (sequence[i] < sequence[i+1]){
//                        isAscending = true;
//                    } else {
//                        isAscending = false;
//                        break;
//                    }
//                    mid++;
//                    i++;
//                }
//            } else {
//                isAscending = true;
//            }
//        }
//
//        if(isDescending && isAscending){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the sequence of integers separated by spaces:");
//        String input = scanner.nextLine();
//        String[] numbers = input.split("\\s+");
//
//        int[] sequence = new int[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            sequence[i] = Integer.parseInt(numbers[i]);
//        }
//        System.out.println(Arrays.toString(sequence));
//        scanner.close();


//        int n = scanner.nextInt();
//        int sum = 0;
//        int reverseSum = 0;
//        long binaryNumber = 0;
//        int  i = 1, step = 1;
//
//
//        while(n != 0) {
//            int remainder = n % 2;
//            binaryNumber += remainder * i;
//            i *= 10;
//            n = n / 2;
//        }
//
//        System.out.println(binaryNumber);

//        int n = 264;
//        int sum = 0;
//        int reverseSum = 0;
//
//        while(n >0) {
//            int remainder = n % 2;
//            sum = sum * 10 + remainder;
//            n = n / 2;
//        }
////        11101001
//        System.out.println(sum);
//
//        while(sum > 0) {
//            int remainder = sum % 10;
//            reverseSum = reverseSum * 10 + remainder;
//            sum = sum / 10;
//        }

//        System.out.println(reverseSum);
//        Binary to decimal
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        int counter = 0;
//        if(n != 0) {
//            while(n > 0) {
//                int last = n % 10;
//                int j = 1;
//                int product = 1;
//                while(j <= counter) {
//                    product *= 2;
//                    j++;
//                }
//                sum += product * last;
//                n = n / 10;
//                counter++;
//            }
//            System.out.println(sum);
//        } else {
//            System.out.println(0);
//        }
//
}

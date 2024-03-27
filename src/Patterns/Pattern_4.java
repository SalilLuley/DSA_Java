package Patterns;

import java.util.Scanner;

//Sample Input 1 :
//        3
//Sample Output 1 :
//        135
//        351
//        513
public class Pattern_4 {

    public static void main(String[] args) {


        for(int i = 0; i < 2; i = i + 1) {
            for(int j = 0; j < 2; j = j + 1) {
                if (j == 1)
                    break;
                System.out.print(j +" ");
            }
        }


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i =0;
        int printNum = 1;
        int printReverseNum = 1;
        int start = 1;
        while (i<n) {

            int j = 1;
            while(j <= n - i) {
                System.out.print(printNum);
                printNum+= 2;
                j++;
            }
            int k = 1;
            while(k <= i) {
                System.out.print(printReverseNum);
                printReverseNum+= 2;
                k++;
            }

            System.out.println("");
            i++;
            start += 2;
            printNum = start;
            printReverseNum = 1;
        }
    }
}

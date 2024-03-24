package Patterns;

import java.util.Scanner;

//Patter

/*
* ~ ~ a ~ ~
* ~ a a a ~
* a a a a a
* ~ a a a ~
* ~ ~ a ~ ~
* */
public class Patterns {
    public static void main(String[] args) {
        int n= 5;
        int i = 0;
        int half = n / 2;
        while(i < n) {
            if (i <=half) {
                int spaces = 1;
                while (spaces <= half - i){
                    System.out.print(" ");
                    spaces++;
                }

                int star = 1;
                while (star <= i + 1){
                    System.out.print("*");
                    star++;
                }

                int nextStar = 1;
                while (nextStar <= i){
                    System.out.print("*");
                    nextStar++;
                }
                System.out.println("");
            } else {
                int spaces = 1;
                while (spaces <= i - half){
                    System.out.print(" ");
                    spaces++;
                }
                int star = 1;
                while (star <= n - i){
                    System.out.print("*");
                    star++;
                }

                int nextStar = 1;
                while (nextStar <= n - i - 1){
                    System.out.print("*");
                    nextStar++;
                }
                System.out.println("");

            }
            i++;
        }
    }
}

package Patterns;
//Input

//        *
//        *1*
//        *121*
//        *12321*
//        *121*
//        *1*
//        *
public class Pattern_2 {

    public static void main(String[] args) {
        int n = 4;
        int i = 0;
        int end = n*2;
        int counter = 1;
        while(i <= end) {
            if (i <= n) {
                int star = 0;
                while (star < 1) {
                    System.out.print("*");
                    star++;
                }
                int printNum = 1;
                while(printNum <= i){
                    System.out.print(printNum);
                    printNum++;
                }

                int printNumReverse = i - 1;
                while(printNumReverse > 0 ) {
                    System.out.print(printNumReverse);
                    printNumReverse--;
                }

                int starEnd = 0;
                while (starEnd < 1 && i !=0) {
                    System.out.print("*");
                    starEnd++;
                }
            } else {
                int star = 0;
                while (star < 1) {
                    System.out.print("*");
                    star++;
                }

                int printNum = 1;
                while( printNum <= (n - counter) ){
                    System.out.print(printNum);
                    printNum++;
                }

                int printNumReverse = n - counter - 1;
                while( printNumReverse > 0 ){
                    System.out.print(printNumReverse);
                    printNumReverse--;
                }

                int starEnd = 0;
                while (starEnd < 1 && i !=end) {
                    System.out.print("*");
                    starEnd++;
                }
                counter++;
            }
            System.out.println("");
            i++;
        }
    }
}

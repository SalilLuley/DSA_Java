package Patterns;

public class Pattern_3 {
    public static void main(String[] args) {

        int n=3;
        int i = 1;
        StringBuilder finalStr = new StringBuilder();
        while( i <= n){
            int j = 1;
            int sum = 0;
            StringBuilder str = new StringBuilder();
            while(j <= i){
                sum+= j;
                str.append(j).append("+");
                j++;
            }
            str.append("=").append(sum);
            int index = str.indexOf("=");
            str.deleteCharAt(index -1);
            finalStr.append(str).append("\n");
            i++;
        }
        System.out.print(finalStr);
    }
}

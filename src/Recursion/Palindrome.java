package Recursion;

public class Palindrome {
    public String reverseString(int length, String original, String answer) {
        if ( length > 0) {
            answer += original.charAt(length - 1);
            return reverseString(length - 1 , original, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String original = "A man, a plan, a canal: Panama";
        String reversed = palindrome.reverseString(original.length(), original, "");
        System.out.println(reversed.equals(original));  // Outputs: "olleh"
    }

}

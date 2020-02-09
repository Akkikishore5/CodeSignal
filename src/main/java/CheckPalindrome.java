import java.util.Arrays;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String input = sn.next();
        checkPalindrome(input);
    }
    static boolean checkPalindrome(String inputString) {
        String[] original = inputString.split("", 0);
        String[] palindrome = reverse(original, original.length);
        if (!Arrays.equals(original, palindrome)) return false;
        else {
            return true;
        }
    }
    static String[] reverse(String original[], int len) {
        String[] palindrome = new String[len];
        int i = len;
        for (int j = 0; j < len; j++) {
            palindrome[i - 1] = original[j];
            i = i - 1;
        }
        return palindrome;
    }
}

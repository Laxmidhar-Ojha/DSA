import java.util.*;

public class Palindrome {

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println(str + " String is not pelindrome");
                return false;
            }
        }
        System.out.println(str + " is palindrome");
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        palindrome(str);
    }
}

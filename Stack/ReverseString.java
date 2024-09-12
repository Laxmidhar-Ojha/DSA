import java.util.*;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            ch.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while (!ch.isEmpty()) {
            char curr = ch.pop();
            res.append(curr);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "abcdef";
        String res = reverseString(str);
        System.out.println(res);
    }
}

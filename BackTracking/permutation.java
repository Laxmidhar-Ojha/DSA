public class permutation {
    public static void perm(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            perm(newStr, ans + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }

}

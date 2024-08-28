public class RemoveDuplicate {

    public static void removeDup(String str, int idx, StringBuilder sb, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        if (map[str.charAt(idx) - 'a'] == false) {
            sb.append(str.charAt(idx));
            map[str.charAt(idx) - 'a'] = true;
        }
        removeDup(str, idx + 1, sb, map);
    }

    public static void main(String args[]) {
        String str = "appnacollege";
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        removeDup(str, 0, sb, map);
    }
}
import java.util.*;

public class Shortestpath {

    public static float shortestpath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else {
                System.out.println("you have entered the incorrect format path");
                return -1;
            }
        }
        float shortestpath = (float) Math.sqrt((x * x + y * y));
        return shortestpath;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path");
        String str = sc.next();
        float shortestpath = shortestpath(str);
        if (shortestpath != -1) {
            System.out.println(shortestpath);
        }
    }

}

import java.util.*;

public class LinearSearch {

    public static int linearSrc(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String menu[] = { "Burger", "Samosa", "Momos", "Coke", "Pizza" };
        String key = "Momos";
        int index = linearSrc(menu, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(index);
        }

    }

}

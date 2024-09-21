import java.util.*;

public class TreeMapBase {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 150);
        tm.put("China", 100);
        tm.put("US", 50);
        tm.put("Australia", 15);

        System.out.println(tm);

    }

}

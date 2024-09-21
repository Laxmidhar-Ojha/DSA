import java.util.*;

public class LoopOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("US", 50);
        hm.put("Australia", 15);

        Set<String> key = hm.keySet();

        for (String k : key) {
            System.out.println("k = " + k + " value = " + hm.get(k));
        }

    }
}
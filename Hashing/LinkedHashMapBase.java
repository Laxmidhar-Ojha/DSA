import java.util.*;

public class LinkedHashMapBase {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 20);
        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 20);
        System.out.println(hm);

    }

}

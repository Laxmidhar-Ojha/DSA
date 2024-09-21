import java.util.*;

public class HashSetBase {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("khaira");
        hs.add("bbsr");
        hs.add("Balasor");
        hs.add("bangaluru");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // for (String city : cities) {
        // System.out.println(city);
        // }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("khaira");
        lhs.add("bbsr");
        lhs.add("Balasor");
        lhs.add("bangaluru");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("khaira");
        ts.add("bbsr");
        ts.add("Balasor");
        ts.add("bangaluru");

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }

}

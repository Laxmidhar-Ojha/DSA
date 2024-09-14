import java.util.*;
import java.util.LinkedList;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}

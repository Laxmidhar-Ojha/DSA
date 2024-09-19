import java.util.*;

public class PriorityQueueBase {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // // use to reverse the priority

        pq.add(new Student("A", 0));
        pq.add(new Student("c", 2));
        pq.add(new Student("B", 1));
        pq.add(new Student("D", 3));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -->" + pq.peek().rank);
            pq.remove();
        }

    }
}

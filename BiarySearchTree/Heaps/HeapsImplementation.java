import java.util.ArrayList;

public class HeapsImplementation {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int child = arr.size() - 1;
            int par = (child - 1) / 2;
            while (arr.get(child) < arr.get(par)) {
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                child = par;
                par = (child - 1) / 2;

            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != idx) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);
            }
        }

        public int remove() {
            int data = arr.get(0);
            int temp = data;
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            arr.remove(arr.size() - 1);

            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(5);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }

}

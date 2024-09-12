import java.util.*;

public class NextGreater {
    public static void nextGreater(int elements[], int nxtGrt[]) {
        Stack<Integer> s = new Stack<>();
        nxtGrt[elements.length - 1] = -1;
        s.push(elements[elements.length - 1]);
        for (int i = elements.length - 2; i >= 0; i--) {
            int currEl = elements[i];
            while (!s.isEmpty() && currEl > s.peek()) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGrt[i] = -1;
            } else {
                nxtGrt[i] = s.peek();
            }
            s.push(elements[i]);
        }
    }

    public static void main(String[] args) {
        int elements[] = { 6, 8, 0, 1, 3 };
        int nxtGrt[] = new int[elements.length];
        nextGreater(elements, nxtGrt);
        for (int i = 0; i < nxtGrt.length; i++) {
            System.out.print(nxtGrt[i] + " ");
        }
    }

}

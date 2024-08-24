public class Others {
    public static void swap(int x, int y) {
        System.out.println("Before swaping x= " + x + " y=" + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swaping x= " + x + " y=" + y);
    }

    public static void printFromUpperToLower() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
        }
    }

    public static void main(String[] args) {
        swap(6, 12);
        int n = 10;
        System.out.println(n + " + 1=" + -(~n)); // adding 1 with the help of bit maniopulation
        printFromUpperToLower();
    }
}

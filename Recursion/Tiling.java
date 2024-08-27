package Recursion;

public class Tiling {

    public static int tillingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1; // base class
        }
        return tillingProblem(n - 1) + tillingProblem(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(25));

    }

}

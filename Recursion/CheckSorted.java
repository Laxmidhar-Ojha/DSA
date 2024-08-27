package Recursion;

public class CheckSorted {

    public static boolean checkSorted(int num[], int i) {
        if (i == num.length - 1) {
            return true;
        }
        if (num[i] > num[i + 1]) {
            return false;
        }
        return checkSorted(num, i + 1);
    }

    public static void main(String[] args) {
        int num[] = { 1, 0, 2, 5, 8 };
        boolean isSort = checkSorted(num, 0);
        System.out.println(isSort);
    }

}

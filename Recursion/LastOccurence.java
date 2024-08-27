package Recursion;

public class LastOccurence {

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int index = lastOccurence(arr, key, i + 1);
        if (index != -1) {
            return index;
        }
        if (key == arr[i]) {
            return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8, 5, 8 };
        int key = 8;
        int index = lastOccurence(arr, key, 0);
        System.out.println(index);
    }

}

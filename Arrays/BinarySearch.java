import java.util.*;

public class BinarySearch {
    public static int binarySearch(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] > key) {
                end = mid - 1;
            }
            if (nums[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 10, 23, 39, 40, 56, 65, 79, 80, 93 };
        int key = 40;
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("No such number present in the array");
        } else {
            System.out.println(key + " is in " + index + " index");
        }

    }

}

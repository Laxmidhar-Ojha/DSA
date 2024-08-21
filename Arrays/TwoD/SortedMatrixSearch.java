public class SortedMatrixSearch {

    public static boolean staircaseSearch(int arr[][], int key) {
        int n = arr[0].length;
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println(key + " is in (" + i + " , " + j + " ) position");
                return true;
            } else if (key > arr[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(key + " is not in the Matrix.");
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        staircaseSearch(arr, 32);
    }

}

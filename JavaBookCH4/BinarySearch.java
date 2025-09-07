public class BinarySearch {
    public static int searcher(int[] a, int n) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (n > a[middle]) {
                left = middle + 1;
            }
            else if (n < a[middle]) {
                right = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 19, 20};
        System.out.println(searcher(arr, 7));
        System.out.println(searcher(arr, 11));
        System.out.println(searcher(arr, 2)); 
    }
}

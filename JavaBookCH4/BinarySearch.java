public class BinarySearch {
    public static int searcher(int[] a, int num) {
        int left = 0, right = a.length;

        while (left < right) {
            int middle = (left + (right-1)) / 2;

            if (a[middle] == num) {
                return middle;
            } else if (num > a[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(searcher(arr, 7));
        System.out.println(searcher(arr, 12)); 
    }
}
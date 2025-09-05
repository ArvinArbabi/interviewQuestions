public class InsertionSort {
    public int[] insertionSorter(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > key; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = key;
        }
        return a;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {5, 2, 4, 6, 1, 3};
        arr = sorter.insertionSorter(arr);
        for (int num : arr) {
            System.out.print(num + ",");
        }
    }
}

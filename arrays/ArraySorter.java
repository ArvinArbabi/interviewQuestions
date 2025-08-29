public class ArraySorter {
    public static int[] ArraySorter(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length && i < b.length; i++) {
            if (a[i] < b[i]) {
                merged[k] = a[i];
                k++;
                merged[k] = b[i];
            } else {
                merged[k] = b[i];
                k++;
                merged[k] = a[i];
            }
            k++; 
        }

        
        for (int i = b.length; i < a.length; i++) {
            merged[k] = a[i];
            k++;
        }

        
        for (int i = a.length; i < b.length; i++) {
            merged[k] = b[i];
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] a = {1, 10};
        int[] b = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] res = ArraySorter(a, b);
        for (int x : res) System.out.print(x + " ");
    }
}

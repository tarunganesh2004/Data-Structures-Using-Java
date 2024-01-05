// TC O(NlogN)

class QuickSort {
    public static void main(String[] args) {
        int a[] = { 13, 18, 27, 2, 19, 25 };
        int n = a.length;

        QuickSort q1 = new QuickSort();

        // Printing the original array
        System.out.println("Original Array:");
        q1.printArr(a, n);

        // Sorting the array using QuickSort
        q1.quickSort(a, 0, n - 1);

        // Printing the sorted array
        System.out.println("\nSorted Array:");
        q1.printArr(a, n);
    }

    public int partition(int[] a, int start, int end) {
        int pivot = a[end]; // pivot element
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;

        return (i + 1);
    }

    public void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quickSort(a, start, p - 1);
            quickSort(a, p + 1, end);
        }
    }

    public void printArr(int[] a, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

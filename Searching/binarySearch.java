class binarySearch {
    public static void main(String[] args) {
        int[] a = { -10, -6, 0, 23, 34, 57, 89, 93, 99 };
        int n = search(a, 23);
        System.out.println(n);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
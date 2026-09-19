class Solution {
    public int reversePairs(int[] nums) {
        // Base case for empty or single-element arrays
        if (nums == null || nums.length <= 1) return 0;
        return mergeSort(nums);
    }

    private int mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0; // Base case: 1 element is always sorted

        // Step 1: Make 2 temporary arrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy-paste original array elements
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // Step 3: Divide and count pairs in sub-arrays
        int count = mergeSort(a) + mergeSort(b);

        // Step 4: Count cross reverse pairs between a and b
        count += countPairs(a, b);

        // Step 5: Merge a and b back into arr
        merge(a, b, arr);

        return count;
    }

    // Corrected two-pointer method to count pairs
    private int countPairs(int[] a, int[] b) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            // Find how many elements in 'b' satisfy the condition for a[i]
            while (j < b.length && (long) a[i] > 2 * (long) b[j]) {
                j++;
            }
            // All elements from index 0 to j-1 in 'b' form a valid pair with a[i]
            count += j;
        }
        return count;
    }

    // Standard merge two sorted arrays code
    private void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}

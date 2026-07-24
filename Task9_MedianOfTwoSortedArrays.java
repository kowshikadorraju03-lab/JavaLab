package lab1;

public class Task9_MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int n = arr1.length;
        int[] merged = new int[2 * n];

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays
        while (i < n && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged[k++] = arr1[i++];
        }

        while (j < n) {
            merged[k++] = arr2[j++];
        }

        // Find the median
        double median;
        int total = merged.length;

        if (total % 2 == 0) {
            median = (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        } else {
            median = merged[total / 2];
        }

        System.out.println("Median of the two sorted arrays is: " + median);
    }
}
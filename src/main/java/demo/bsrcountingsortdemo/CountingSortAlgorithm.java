package demo.bsrcountingsortdemo;

public class CountingSortAlgorithm {

    private static void countingSort(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // Find the maximum element
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        int[] count = new int[max + 1];

        for (int j : arr) {
            count[j]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements into the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);

        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

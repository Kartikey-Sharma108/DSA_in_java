public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Boundary of the sorted portion moves right each pass
        for (int i = 0; i < n - 1; i++) {

            // Assume the first unsorted element is the minimum
            int minIndex = i;

            // Scan the rest of the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // Found a new minimum
                }
            }

            // Swap the found minimum into its correct position
            // (only swap if we actually found something smaller)
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before: " + java.util.Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After:  " + java.util.Arrays.toString(arr));
    }
}

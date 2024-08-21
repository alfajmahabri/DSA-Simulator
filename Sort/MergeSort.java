package Sort;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int h) {
        if (l < h) {  // Base case for recursion
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            Merge(arr, l, mid, h);
        }
    }

    public static void Merge(int[] arr, int l, int mid, int h) {
        int n1 = mid - l + 1;
        int n2 = h - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Fill left and right arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;

        // Merge the temp arrays back into the original array
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of left[]
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements of right[]
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

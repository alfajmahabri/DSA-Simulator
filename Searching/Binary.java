package Searching;
import java.util.Arrays;

public class Binary {
    public void BinarySearch(int[] arr, int search) {
        Arrays.sort(arr);
        int high, mid, low;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Element is present in the array");
                return;
            } else {
                if (search < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        System.out.println("Element is not present in the array");
    }
}

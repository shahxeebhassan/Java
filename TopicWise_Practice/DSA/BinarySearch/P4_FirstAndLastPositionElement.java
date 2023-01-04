import java.util.Arrays;

public class P4_FirstAndLastPositionElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8, 8, 8, 9 };
        int key = 3;
        int[] ans = srch(arr, key);
        System.out.println(Arrays.toString(ans));
        // System.out.println(srch(arr, key));
    }

    public static int[] srch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int a = 0;
        int b = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] == key && arr[mid - 1] == key) {
                start = start - 1;
                // return mid;
            } else {
                a = mid;
                break;
            }
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] == key && arr[mid + 1] == key) {
                start = start + 1;
                // return mid;
            } else {
                // return mid;
                b = mid;
                break;
            }
            }
            int [] ans = {a, b};
            return ans;
        }
    }


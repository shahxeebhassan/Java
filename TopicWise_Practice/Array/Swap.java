import java.util.Arrays;

/**
 * Swap
 */
public class Swap {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }
}
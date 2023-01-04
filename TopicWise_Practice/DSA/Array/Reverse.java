import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        rever(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rever(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    private static void swap(int[] arr, int index1, int index2) {
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }
}

public class BinarySrchDes {
    public static void main(String[] args) {
        int[] arr = { 100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50 };
        int key = 100;
        int ans = srch(arr, key);
        System.out.println(ans);
    }

    public static int srch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) {
                start = mid + 1;
            } else if (key > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

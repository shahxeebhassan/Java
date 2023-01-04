/**
 * OrderAgnosticBinarySrch
 */
public class OrderAgnosticBinarySrch {

    public static void main(String[] args) {
        int[] arr1 = { 100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50 };
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int key = 10;
        int ans = srch(arr, key);
        System.out.println(ans);
    }

    public static int srch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
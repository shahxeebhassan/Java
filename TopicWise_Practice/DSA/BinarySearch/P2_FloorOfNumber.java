/*  Floor = largest element in array smaller than or equal to that number
For Example in this case ,ceiling of 4 = 5,ceiling pf 8=9 ceiling of 9 is 9 
*/
public class P2_FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int key = 15;
        int ans = binarySrch(arr, key);
        System.out.println(ans);
    }

    public static int binarySrch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return end;
    }
}

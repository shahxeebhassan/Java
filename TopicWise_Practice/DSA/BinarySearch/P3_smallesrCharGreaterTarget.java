import java.util.Arrays;

public class P3_smallesrCharGreaterTarget {
    public static void main(String[] args) {
        char[] arr = { 'a', 'c','d','r'};
        char key = 'a';
        char ans = binarySrch(arr, key);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }

    public static char binarySrch(char[] arr, char key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // if (start ==arr.length) {
        //     return arr[0];
        // }
                // or 
        return arr[start%arr.length];
        // return arr[start];

    }
}

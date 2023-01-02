import java.util.Arrays;
/**
 * search target and return index key
 */
public class lisrch {

    public static void main(String[] args) {
        int[] arr = {12,2323,23,2,1,1,2,3,4,5,987};
        int ans = srch(arr, 97);
        System.out.println(ans);
    }
    public static int srch(int[] arr ,int key) {
        if (arr.length==0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]== key) {
                return index;
            }
        }
        return -1;
    }
}
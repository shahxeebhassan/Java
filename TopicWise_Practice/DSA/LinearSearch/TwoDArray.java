import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = {
            {1,5,7,66,55,44,56,76,8766,8754},
            {0,89,9097,665,3546,866,6534,134,977},
            {45676,7567454,897656534,98976789,9876,8765,9800,98,987}
        };
        int key = 987;
        int[] ans = Srch(arr, key);
        System.out.println(Arrays.toString(ans));
    }

    private static int[]  Srch(int[][] arr, int key) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==key) {
                    return new int []{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

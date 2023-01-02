public class MaxAndMin2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 7, 66, 55, 44, 56, 76, 8766, 8754 },
                { 0, 89, 9097, 665, 3546, 866, 6534, 134, 977 },
                { 45676, 7567454, 897656534, 98976789, 9876, 8765, 9800, 98, 987 }
        };
        int[] ans = MinandMax(arr);
        System.out.println("\nMin number in given array is "+ans[1]+"\nMax number in given array is "+ans[0]);
    }


    public static int[] MinandMax(int[][] arr) {
        int max=arr[0][0];
        int min=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max<arr[row][col]) {
                    max=arr[row][col];
                }
                if (min>arr[row][col]) {
                    min=arr[row][col];
                }
            }
        }
        return new int[]{max,min};
    }
}

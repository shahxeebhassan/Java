public class Max {
    public static void main(String[] args) {
        int[] num = {12,14,100,111,150,2000,200};
        System.out.println(max(num));

    }
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
}

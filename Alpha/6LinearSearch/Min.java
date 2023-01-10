public class Min {
    public static void main(String[] args) {
        int[] num = {12,14,100,111,150,2000,200};
        System.out.println(min(num));
    }
    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
}

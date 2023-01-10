import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = new int[1000];
        for (int i = 0; i < num.length; i++) {
            num[i]=i;
        }
        System.out.println(Arrays.toString(num));
        int ans = srch(num, 999);
        System.out.println(ans);
    }
    public static int srch(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== key) {
                return i;
            }
        }
        return -1;
    }
}

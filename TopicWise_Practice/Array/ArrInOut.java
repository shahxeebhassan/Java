import java.util.Arrays;
import java.util.Scanner;

public class ArrInOut {
    public static void main(String[] args) {
        int[] arr = new int[5]; // size imp to declare else error
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        // for (int i=0; i<arr.length;i++) {
        //     System.out.print(arr[i]+" ");
        // }

        System.out.println(Arrays.toString(arr));
    }
}

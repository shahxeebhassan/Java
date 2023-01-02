// package class10;
import java.util.*;
public class array2 {
    public static void main(String[] args) {
        int [] marks_1st = new int [6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks of subjct");
            marks_1st[i] = sc.nextInt();
            sum+=marks_1st[i];
        }
        for (int i = 0; i < 6; i++) {
            System.out.println( marks_1st[i]);
        }
        System.out.println("\n" + sum);
    }
}

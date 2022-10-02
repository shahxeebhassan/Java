package class5;
import java.util.Scanner;

public class zeroonetri {
    public static void main(String[] args) {
        // 0-1 triangle
        System.out.println("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

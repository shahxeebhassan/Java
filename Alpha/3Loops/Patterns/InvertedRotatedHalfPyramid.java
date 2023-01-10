import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        for (int row = 1; row <=rows; row++) {
            for (int col = rows-row; col >=1; col--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

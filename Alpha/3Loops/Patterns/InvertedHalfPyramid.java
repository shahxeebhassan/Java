import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        byte rows = sc.nextByte();
        // for (int row = rows; row >=1; row--) {
        //     for (int col = 1; col <= row; col++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for (int row = 1; row <=rows; row++) {
            for (int col = 1; col <=rows-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

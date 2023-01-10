import java.util.Scanner;

public class InvertedHalfPyramidNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        byte rows = sc.nextByte();
        for (int row = rows; row >=1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

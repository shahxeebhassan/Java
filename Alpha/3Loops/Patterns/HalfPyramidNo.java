import java.util.Scanner;

import javax.sql.RowSet;

public class HalfPyramidNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        byte rows = sc.nextByte();
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

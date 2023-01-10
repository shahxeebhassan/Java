import java.util.Scanner;
public class InvertedHalfPyramidNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        byte rows = sc.nextByte();
        int counter = rows*(rows+1) /2;
        for (int row = rows; row >=1; row--) {
            for (int col = 1; col <=row; col++,counter--) {
                System.out.print(counter+" ");
            }
            System.out.println();
        }
    }
}

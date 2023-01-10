import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        byte rows = sc.nextByte();
        int counter = 1;
        for (int row = 1; row <=rows; row++) {
            for (int col = 1; col <=row; col++,counter++) {
                System.out.print(counter+ " ");
            }
            System.out.println();
        }

    }
}

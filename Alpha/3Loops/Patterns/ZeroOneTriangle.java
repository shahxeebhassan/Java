import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextByte();
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <=row; col++) {
                if ((row+col)%2==0) {
                    System.out.print(1);    
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

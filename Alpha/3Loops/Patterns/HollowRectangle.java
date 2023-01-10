import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        byte rows = sc.nextByte();
        System.out.print("Enter the number of columns : ");
        byte cols= sc.nextByte();
        for (int row = 1; row <=rows; row++) {
            for (int col = 1; col <=cols; col++) {
                if (col==1||col==cols||row==1 ||row==rows) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}

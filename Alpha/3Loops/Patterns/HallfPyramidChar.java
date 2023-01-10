import java.util.Scanner;

public class HallfPyramidChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numb er of rows: ");
        byte rows = sc.nextByte();
        char ch = 65;
        for (int row = 1; row <=rows; row++) {
            for (int col = 1; col <=row; col++,ch++) {
                System.out.print(ch+" ");
            }
        System.out.println();         
        }

    }
}

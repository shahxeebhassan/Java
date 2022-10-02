package class5;

import java.util.Scanner;

public class invertedhalfpyramidwithnos {
    // inverted half pyramid with numbers
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for (int i = 1;i <= rows; i++) {
            for (int j = 1; j <= rows-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
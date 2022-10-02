<<<<<<< HEAD
package class5;
=======
package ApnaCollege.class5;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6

import java.util.Scanner;

public class halfpyramidwithnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

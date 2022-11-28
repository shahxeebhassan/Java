<<<<<<< HEAD
package class5;
=======
package ApnaCollege.class5;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6

import java.util.Scanner;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

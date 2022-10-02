<<<<<<< HEAD
package class5;
=======
package ApnaCollege.class5;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;

public class hollowrect {
    //Write a program that will draw a hollow rectangle.
    public static void main(String[] args) {
        System.out.println("Enter the width of the rectangle: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int cols = sc.nextInt();
        for (int i = 1; i <= rows;i++){
            for (int j = 1; j <= cols;j++){
                if (i == 1 || j == 1 || i == rows || j == cols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();

        }
    }
}

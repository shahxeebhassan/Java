<<<<<<< HEAD
package class5;
=======
package ApnaCollege.class5;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;

public class FloydsTriangle {
    
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

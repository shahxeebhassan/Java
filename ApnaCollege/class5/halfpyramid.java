<<<<<<< HEAD
package class5;
=======
package ApnaCollege.class5;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;

public class halfpyramid {

    public static void main(String[] args) {
        
        System.out.println("Enter the height of half-pyramid");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

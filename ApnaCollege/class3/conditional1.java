<<<<<<< HEAD
package class3;
=======
package ApnaCollege.class3;

>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;

/**
 * 01_conditional
 */
public class conditional1 {

    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        System.out.println("\nEnter a number");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

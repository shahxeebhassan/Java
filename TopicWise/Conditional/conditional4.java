<<<<<<< HEAD
package class3;
=======
package ApnaCollege.class3;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;

/**
 * conditional4
 */
public class conditional4 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num%2==0?"Even":"Odd") {
            case "Even":
                System.out.println("Even");
                break;
            case "Odd":
                System.out.println("Odd");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
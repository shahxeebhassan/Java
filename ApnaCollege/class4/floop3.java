<<<<<<< HEAD
package class4;
=======
package ApnaCollege.class4;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;

public class floop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1;i<=num;i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to " + num + " is " + sum);
        }        
    }

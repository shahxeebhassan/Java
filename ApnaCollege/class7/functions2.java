<<<<<<< HEAD
package class7;
=======
package ApnaCollege.class7;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6

import java.util.Scanner;
// function to add two numbers and return sum
public class functions2 {
    public static int AddTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        // System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        int Sum = AddTwoNumbers(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + Sum);
    }
}

<<<<<<< HEAD
package class3;
=======
package ApnaCollege.class3;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.Scanner;


public class conditional5 {
    public static void main(String[] args) {
        System.out.println("Enter value 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter value 2");
        int num2 = sc.nextInt();
        System.out.println("Enter an operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }    
}

<<<<<<< HEAD
package class7;
=======
package ApnaCollege.class7;
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
import java.util.*;
// factorial of a number

public class functions4 {
    public static void Factorial(int num){
        if (num < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       System.out.println("Factorial of "+num+" is: ");
        Factorial(num);
    }
}

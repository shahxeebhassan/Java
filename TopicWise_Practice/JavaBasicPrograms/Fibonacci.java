/**
 *  In fibonacci series next number is the sum of previous two numbers.
 *  For Example 0,1,1,2,3,5,8,13,21,34,55,etc
 *  The first two numbers of Fibonacci series are 0 and 1 
 *  Can also be done with recursion
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of Fibonacci Numbers to print:  ");
        count = sc.nextInt();
        System.out.print(n1 + " "+n2);//Printing 0 and 1
        for (i = 2; i < count; ++i) {
            n3 = n1+n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
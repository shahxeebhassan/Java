import java.util.Scanner;

/*
 *  Factorial of n is the product of all positive descending integers.
 *  Factorial of n is denoted by n!
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        int Fact =1;
        for (int i = 1; i <= num; i++) {
            Fact = Fact*i;
        }
        System.out.println(Fact);
    }
}

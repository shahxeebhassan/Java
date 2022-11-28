// package Loops;
import java.util.*;
/**
 * countdigits
 */
public class sumofDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int orgNum=num;
        int sumofDigits = 0;
        while (num >0) {
            sumofDigits=sumofDigits+num%10;
            num/=10;
        }
        System.out.println("The sum of digits of "+orgNum+" are "+sumofDigits);
    }
}
// package Loops;
import java.util.*;
/**
 * countdigits
 */
public class Countdigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int orgNum=num;
        int numberofDigits = 0;
        while (num >0) {
            num/=10;
            numberofDigits++;
        }
        System.out.println("The number of digits in "+orgNum+" are "+numberofDigits);
    }
}
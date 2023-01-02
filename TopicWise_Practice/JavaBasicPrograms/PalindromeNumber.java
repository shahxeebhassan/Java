// Palindrome no is a number that is same after reverse
/*  Palindrome Number algorith is as follows:
1) Get the number to check for Palindrome 
2) Hold the number in temporary variable
3) Reverse the number
4) Compare the temporary number with the reversed number 
5) If both numbers are same, print "palindrome number"
6) Else print "Not Palindrome Number"
 * 
 */
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int lastDig;
        int sreversedNo=0;
        while (num!= 0) {
            lastDig = num % 10;
            reversedNo = (reversedNo*10)+lastDig;
            num = num/10;
        }
        if (temp == reversedNo) {
            System.out.println(temp+ " is Palindrome Number");
        } else {
            System.out.println(temp+" is not Palindrome Number");
        }
    }
}

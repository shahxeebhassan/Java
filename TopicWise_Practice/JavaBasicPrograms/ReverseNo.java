/*
 * Algorithm for Reversing a Numbber:-
1) Get the number to reverse
2) While the number is not equal to 0 Repeat step 3,4,5
3) Get last number of the number by num % 10
4) Multiply rev =rev * 10 (rev is 0 initially) then add last digit from step 3 in rev
5) Divide num with 10 
6) Print the reversed number 
*/
import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse it : ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int rem = num% 10;
            rev = (rev*10)+rem;
            num/=10;
        }
        System.out.println("The reversed number is "+rev);
    }
}

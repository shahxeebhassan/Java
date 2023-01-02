// package class4;
import java.util.Scanner;

public class Floop3 {
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

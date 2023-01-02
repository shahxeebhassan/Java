import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original;
        String reversed="";
        System.out.print("Enter any String/Number: ");
        original=sc.nextLine();
        int length = original.length();
        for (int i = length-1; i >=0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println(original+" is Palindrome");
        }
        else{
            System.out.println(original+" is not Palindrome");
        }
    }
}

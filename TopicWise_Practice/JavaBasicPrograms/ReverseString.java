import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original;
        String reversed="";
        System.out.println("Enter a String/Number");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length-1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        System.out.println(reversed);
    }
}

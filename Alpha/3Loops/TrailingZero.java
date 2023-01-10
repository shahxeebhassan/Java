import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        System.out.print("Enter a number to find trailing zeros in its factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        for (int i = 5; i <= num; i=i*5) {
            ans = ans+num/i;
        }
        System.out.println(ans);
    }
}

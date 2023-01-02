import java.util.Scanner;
public class SumofNnaturalnos1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = in.nextInt();
        int sum = num*(num+1)/2;
        System.out.println(sum);
    }
}

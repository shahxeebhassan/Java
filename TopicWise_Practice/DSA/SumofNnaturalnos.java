import java.util.Scanner;
public class SumofNnaturalnos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

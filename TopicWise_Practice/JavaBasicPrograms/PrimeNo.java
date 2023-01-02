import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = 0;
        int sflag = 0;
        System.out.print("Enter a number to check Prime or not: ");
        int num = sc.nextInt();
        mid = num / 2;
        if (num == 0 || num== 1) {
            System.out.println(num +" is not prime number");
        } else {
            for (int i = 2; i <= mid; i++) {
                if (num % 2 == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num +" is prime number");
            }
        }
        
    }
}

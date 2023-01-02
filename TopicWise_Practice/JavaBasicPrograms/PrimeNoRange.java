import java.util.Scanner;

public class PrimeNoRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int start = sc.nextInt();
        System.out.print("Enter last number: ");
        int end = sc.nextInt();
        System.out.println("List of prime numbers between "+start+ " and "+end);
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}

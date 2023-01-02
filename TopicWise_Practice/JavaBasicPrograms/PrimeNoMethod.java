public class PrimeNoMethod {
    static void checkPrime(int num){
        // Scanner sc = new Scanner(System.in);
        int mid = 0;
        int flag = 0;
        // System.out.print("Enter a number to check Prime or not: ");
        // num = sc.nextInt();
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
    public static void main(String[] args) {
        checkPrime(0);
        checkPrime(1);
        checkPrime(3);
        checkPrime(4);
        checkPrime(7);
    }
}

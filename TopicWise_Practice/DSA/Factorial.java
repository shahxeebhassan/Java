import java.util.Scanner;
class Fact {
    long ans = 1;
    public Fact(){}
    public Fact(int num) {
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
            System.out.println("Constructor "+ans);
        }
    }
    public void fact(int num) {
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
            System.out.println("Method "+ans);
        }
    }
}

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a num");
            int num = sc.nextInt();
            System.out.println("Enter another num");
            int num1 = sc.nextInt();
            Fact f = new Fact();
            System.out.println();
            Fact e = new Fact(num);
            System.out.println();
            f.fact(num1);
        }
    }
}
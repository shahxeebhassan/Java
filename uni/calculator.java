import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double n1, n2;
        double ans;
        char op;
        String Reuse;
        System.out.println("\n\n\n\n*****   Welcome to the Calculator ---(Developed by Zaibi)   *****");
        Scanner inputOp = new Scanner(System.in);
        System.out.println(
                "\n\n\nEnter your selection(1-4):\n1:Addition (+)\n2:Subtraction (-)\n3:Multiplication (*)\n4:Division (/)\n5:Close Calculator\n\n");
        op = inputOp.next().charAt(0);
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);

        while (true) {

            if (op == '5') {
                System.out.println("\n\nThanks for using Calculator\n\n");
                break;
            } else {
                System.out.println("Enter value 1");
                n1 = inputNum1.nextDouble();
                System.out.println("Enter value 2");
                n2 = inputNum2.nextDouble();
                if (op == '1') {
                    ans = n1 + n2;
                    System.out.println(ans);
                    // continue aa;
                } else if (op == '2') {
                    ans = n1 - n2;
                    System.out.println(ans);
                } else if (op == '3') {
                    ans = n1 * n2;
                    System.out.println(ans);
                } else if (op == '4') {
                    ans = n1 / n2;
                    System.out.println(ans);
                } else if (op == '5') {

                }
            }
            // System.out.println("\nEnter your selection\n1:Proceed with answer(Yes / No");
            // Reuse = sc.next();
            // if (Reuse == "Yes") {
            // n1 = (int) ans;
            // System.out.println("Enter operator (+,-,/,*");
            // op = sc.next().charAt(0);
            // System.out.println("Enter value 2");
            // n2 = sc.nextInt();

        }
    }
}

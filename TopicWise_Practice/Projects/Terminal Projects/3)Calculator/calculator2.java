import java.util.Scanner;

public class calculator2 {
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

        while (op == '1' || op == '2' || op == '3' || op == '4' || op == '5') {
            if (op == '5') {
                System.out.println("\n\nThanks for using Calculator\n\n");
                break;
            } else {
                System.out.println("Enter value 1");
                n1 = inputNum1.nextDouble();
                System.out.println("Enter value 2");
                n2 = inputNum2.nextDouble();
                switch (op) {
                    case '1':
                        ans = n1 + n2;
                        System.out.println(ans);
                        break;
                    case '2':
                        ans = n1 - n2;
                        System.out.println(ans);
                        break;
                    case '3':
                        ans = n1 * n2;
                        System.out.println(ans);
                        break;
                    case '4':
                        ans = n1 / n2;
                        System.out.println(ans);

                }
            }
        }
    }
}

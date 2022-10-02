import java.util.Scanner;

public class calculator4 {
    public static void main(String[] args) {
        double n1, n2;
        double ans;
        char op, ask1, ask2;
        // String Reuse;
        System.out.println("\n\n\n\n*****   Welcome to the Calculator ---(Developed by Zaibi)   *****");
        Scanner inputOp = new Scanner(System.in);
        System.out.println(
                "\n\n\nEnter your selection(1-5):\n1:Addition (+)\n2:Subtraction (-)\n3:Multiplication (*)\n4:Division (/)\n5:Close Calculator\n\n");
        op = inputOp.next().charAt(0);
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        while (true) {
            if (op == '5') {
                System.out.println("\n\nThanks for using Calculator\n\n");
                break;
            } else {
                System.out.println("\n#######################\n                       \nEnter Value 1:");
                n1 = inputNum1.nextDouble();
                System.out.println("\nEnter value 2\n");
                n2 = inputNum2.nextDouble();
                switch (op) {
                    case '1':
                        ans = n1 + n2;
                        System.out.println(
                                "\n#######################\n  The answer is " + ans + "\n#######################\n");
                        System.out.println(
                                "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                        ask1 = inputStr.next().charAt(0);
                        aa: while (ask1 == '1') {
                            System.out.println("Enter operator");
                            op = inputOp.next().charAt(0);
                            System.out.println("Enter value 2");
                            n2 = inputNum2.nextDouble();
                            if (op == '+') {
                                ans = ans + n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                                // continue aa;
                            } else if (op == '-') {
                                ans = ans - n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '*') {
                                ans = ans * n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '/') {
                                ans = ans / n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else {
                                System.out.println("Invalid Op");
                            }
                            System.out.println(
                                    "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                            ask2 = inputStr.next().charAt(0);
                            if (ask2 == '1') {
                                continue aa;
                            } else {
                                System.out.println("\n\nThanks for using Calculator\n\n");
                                break;
                            }

                        }
                        if (ask1 != '1') {
                            System.out.println("\n\nThanks for using Calculator\n\n");
                            break;
                        }
                        break;
                    case '2':
                        ans = n1 - n2;
                        System.out.println(
                                "\n#######################\n  The answer is " + ans + "\n#######################\n");
                        System.out.println(
                                "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                        ask1 = inputStr.next().charAt(0);
                        aa: while (ask1 == '1') {
                            System.out.println("Enter operator");
                            op = inputOp.next().charAt(0);
                            System.out.println("Enter value 2");
                            n2 = inputNum2.nextDouble();
                            if (op == '+') {
                                ans = ans + n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                                // continue aa;
                            } else if (op == '-') {
                                ans = ans - n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '*') {
                                ans = ans * n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '/') {
                                ans = ans / n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else {
                                System.out.println("Invalid Op");
                            }
                            System.out.println(
                                    "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                            ask2 = inputStr.next().charAt(0);
                            if (ask2 == '1') {
                                continue aa;
                            } else {
                                System.out.println("\n\nThanks for using Calculator\n\n");
                                break;
                            }

                        }
                        if (ask1 != '1') {
                            System.out.println("\n\nThanks for using Calculator\n\n");
                            break;
                        }
                        break;
                    case '3':
                        ans = n1 * n2;
                        System.out.println(
                                "\n#######################\n  The answer is " + ans + "\n#######################\n");
                        System.out.println(
                                "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                        ask1 = inputStr.next().charAt(0);
                        aa: while (ask1 == '1') {
                            System.out.println("Enter operator");
                            op = inputOp.next().charAt(0);
                            System.out.println("Enter value 2");
                            n2 = inputNum2.nextDouble();
                            if (op == '+') {
                                ans = ans + n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                                // continue aa;
                            } else if (op == '-') {
                                ans = ans - n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '*') {
                                ans = ans * n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '/') {
                                ans = ans / n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else {
                                System.out.println("Invalid Op");
                            }
                            System.out.println(
                                    "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                            ask2 = inputStr.next().charAt(0);
                            if (ask2 == '1') {
                                continue aa;
                            } else {
                                System.out.println("\n\nThanks for using Calculator\n\n");
                                break;
                            }

                        }
                        if (ask1 != '1') {
                            System.out.println("\n\nThanks for using Calculator\n\n");
                            break;
                        }
                        break;

                    case '4':
                        ans = n1 / n2;
                        System.out.println(
                                "\n#######################\n  The answer is " + ans + "\n#######################\n");
                        System.out.println(
                                "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                        ask1 = inputStr.next().charAt(0);
                        aa: while (ask1 == '1') {
                            System.out.println("Enter operator");
                            op = inputOp.next().charAt(0);
                            System.out.println("Enter value 2");
                            n2 = inputNum2.nextDouble();
                            if (op == '+') {
                                ans = ans + n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                                // continue aa;
                            } else if (op == '-') {
                                ans = ans - n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '*') {
                                ans = ans * n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else if (op == '/') {
                                ans = ans / n2;
                                System.out.println("\n#######################\n  The answer is " + ans
                                        + "\n#######################\n");
                            } else {
                                System.out.println("Invalid Op");
                            }
                            System.out.println(
                                    "\n\nChoose(1-2)\n1:Proceed with answer\n2:Close the calculator\n\n");
                            ask2 = inputStr.next().charAt(0);
                            if (ask2 == '1') {
                                continue aa;
                            } else {
                                System.out.println("\n\nThanks for using Calculator\n\n");
                                break;
                            }

                        }
                        if (ask1 != '1') {
                            System.out.println("\n\nThanks for using Calculator\n\n");
                            break;
                        }
                        break;
                }
            }
            break;
        }

    }
}

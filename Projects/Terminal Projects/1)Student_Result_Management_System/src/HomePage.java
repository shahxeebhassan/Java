import java.util.InputMismatchException;
import java.util.Scanner;

public class HomePage {
    // selection
    byte choice;
    byte choice1;
    // login
    String username = "";
    String password = "";

    public HomePage() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\n\n\n\n*****   Welcome to the Student Result Management System ---(Developed by Clever Clowns)---  *****\n\n\nWho are You ?\n\n1. Admin\n2. User or Student\n3. Exit Program\n\nEnter your choice : ");
        HOME: while (true) {
            try {
                choice = sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Enter an Integer Value");
                sc.next();
                continue HOME;
            }

            if (choice == 3) {
                System.exit(0);
            } else if (choice == 1) {
                Admin admin = new Admin();
            } else if (choice == 2) {
                Student student = new Student();
            } else {
                System.out.println("\nInvalid Selection");
                continue HOME;
            }
            // break;
            choice:while (true) {
                System.out.println(
                        "\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Admin Panel \n3. Exit Program");
                try {
                    choice1 = sc.nextByte();
                } catch (InputMismatchException e) {
                    System.out.println("\nEnter an Integer Value");
                    sc.next();
                    continue choice;
                }
                if (choice1 == 1) {
                    continue HOME;
                } else if (choice1 == 2) {
                    Admin admin = new Admin();

                } else if (choice1 == 3) {
                    System.exit(0);
                } else {
                    System.out.println("\nInvalid Selection");
                    // break;
                    continue choice;
                }
            }
        }
    }

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
    }
}
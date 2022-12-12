import java.util.InputMismatchException;
import java.util.Scanner;

public class HomePage {
    // selection
    private char choice;
    private char choice1;
    // login
    private String username = "";
    private String password = "";

    public HomePage() {
        Scanner sc = new Scanner(System.in);
        // HOME: while (true) {
            System.out.print(
                "\n\n\n\n*****   Welcome to the Student Result Management System ---(Developed by Clever Clowns)---  *****\n\n\nWho are You ?\n\n1. Admin\n2. User or Student\n3. Exit Program\n\nEnter your choice : ");
                choice = sc.next().charAt(0);
 
            if (choice == '3') {
                System.exit(0);
            } else if (choice == '1') {
                Admin admin = new Admin();
            } else if (choice == '2') {
                Student student = new Student();
            } else {
                System.out.println("\nInvalid Selection");
                // continue HOME;
                HomePage homePage = new HomePage();
            }
            // break;
            choice:while (true) {
                System.out.println("\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Admin Panel \n3. Exit Program");
                    choice1 = sc.next().charAt(0);
                if (choice1 == 1) {
                    // continue HOME;
                    HomePage homePage = new HomePage();
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
    // }

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
    }
}
import java.util.Scanner;

public class HomePage {
    //selection
    byte choice;
    byte choice1;
    //login
    String username = "";
    String password = "";

    public HomePage() {
        HOME: while (true) {
            System.out.println(
                    "\n\n\n\n*****   Welcome to the Student Result Management System ---(Developed by Clever Clowns)   *****\n\n\nWho are You ?\n\n1. Admin\n2. User or Student\n3. Exit Program\n\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextByte();
            if (choice == 3) {
                System.exit(0);
            } 
            login:while (choice == 1) {
                System.out.println("\nEnter Username: ");
                username = sc.next();
                System.out.println("\nEnter Password: ");
                password = sc.next();
                if (username.equals("admin") && password.equals("pass")) {
                    System.out.println("\nAccess Granted\n\n");
                    Aa: while (choice == 1) {

                        Admin admin = new Admin();
                        System.out.println(
                                        "\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Admin Panel \n3. Exit Program");
                        choice1 = sc.nextByte();
                        if (choice1 == 1) {
                            continue HOME;
                        } else if (choice1 == 2) {
                            continue Aa;
                        } else if (choice1 == 3) {
                            System.exit(0);
                        } else {
                            System.out.println("\nInvalid Selection");
                            break;
                        }
                    }
                }
                else{
                    System.out.println("\nAccess Denied\n Enter valid username or password:");
                    continue login;
                }

            } if (choice == 2) {
                B: while (choice == 2) {
                    Student student = new Student();
                    System.out.println(
                            "\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Student Panel \n3. Exit Program");
                    choice1 = sc.nextByte();
                    if (choice1 == 1) {
                        continue HOME;
                    } else if (choice1 == 2) {
                        continue B;
                    } else if (choice1 == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Selection");
                    }
                }
            } else {
                System.out.println("Invalid Selection");
            }
            break;
        }
    }
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
    }
}

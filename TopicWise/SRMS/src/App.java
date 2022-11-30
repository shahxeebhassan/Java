import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        byte choice;
        byte choice1;
        HOME:while (true) {
            System.out.println(
                    "\n\n\n\n*****   Welcome to the Student Result Management System ---(Developed by Zaibi)   *****\n\n\nWho are You ?\n\n1. Admin\n2. User or Student\n3. Exit Program\n\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextByte();
            if (choice == 3) {
                break;
            } else if (choice == 1) {
                Aa: while (choice == 1) {
                    Admin admin = new Admin();
                    System.out.println("\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Admin Panel \n3. Exit Program");
                    choice1 = sc.nextByte();
                    if (choice1 == 1) {
                        continue HOME;
                    }
                    else if (choice1 == 2) {
                        continue Aa;
                    }
                    else if(choice1 == 3)
                    {
                        break;
                    }
                    else{
                        break;
                    }
                }
            } else if (choice == 2) {
                B: while (choice == 2) {
                    Student student = new Student();
                    System.out.println("\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Student Panel \n3. Exit Program");
                    choice1 = sc.nextByte();
                    if (choice1 == 1) {
                        continue HOME;
                    }
                    else if (choice1 == 2) {
                        continue B;
                    }
                    else if(choice1 == 3)
                    {
                        break;
                    }
                    else{
                        break;
                    }
                }
            }else{
                System.out.println("Invalid Selection");
            }
            break;
        }
    }
}

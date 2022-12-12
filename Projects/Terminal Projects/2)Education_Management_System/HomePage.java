import java.util.Scanner;

public class HomePage {
    byte choice;
    // byte choice1;

    public HomePage() {
        System.out.println(
                "\n\n\n\n####   Welcome to the Education Management System ---\n(Developed by Talented Tertles)   ####\n\n1.Student Data\n2.Faculty Data\n3.Hostel Data\n4.Staff Data\n5.Search Records\n6. Exit\nEnter your choice:");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextByte();
        if (choice == 4) {
            System.exit(0);
        } else if (choice == 1) {
            Student admin = new Student();
        } else if (choice == 2) {
            // B: while (choice == 2) {
            Faculty student = new Faculty();
        } else if (choice == 3) {
            // B: while (choice == 2) {
            Hostel student = new Hostel();
        } else if (choice == 4) {
            Staff teacher = new Staff();
        } else if (choice == 5) {
            Search search = new Search();
        }

        else {
            System.out.println("Invalid Selection");
        }
        while (true) {
            System.out.println("Do you want to continue? (Y/N)");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                HomePage home = new HomePage();
            } else if (ch == 'N' || ch == 'n') {
                System.exit(0);
            } else {
                System.out.println("Invalid Selection");
            }
        }

    }

    public static void main(String[] args) {
        HomePage home = new HomePage();
    }
}

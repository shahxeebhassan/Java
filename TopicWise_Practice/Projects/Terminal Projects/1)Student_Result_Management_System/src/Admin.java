import java.util.Scanner;

public class Admin {
    char choice;
    public Admin() {
        // byte choice1;
        // label: while (true) {
        System.out.print(
                "\n......................................................................................................................................\n\n\n*****   Welcome Admin   *****\n\n\nAdmin Panel\n\n1. Add Student\n2. Add Result\n3. Update Student\n4. Update Result\n5. Delete Record\n6. Go to HomePage\n7. Exit\n\nEnter your choice : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.next().charAt(0);
        if (choice == '1') {
            new AddStudent();
            // break;
        } else if (choice == '2') {
            new AddResult();
            // break;
        } else if (choice == '3') {
            new UpdateStudent();
            // break;
        } else if (choice == '4') {
            new UpdateRes();
            // break;
        } else if (choice == '5') {
            new Delete();
            // break;
        } else if (choice == '6') {
            HomePage home = new HomePage();
        } else if (choice == '7') {
            System.exit(0);
        } else {
            System.out.println("Invalid Selection");
            // To go back to Admin Panel
            new Admin();
        }
    }
    // public static void main(String[] args) {
    //     new Admin();
    // }
}

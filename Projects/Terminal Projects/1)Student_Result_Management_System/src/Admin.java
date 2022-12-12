import java.util.Scanner;

import java.sql.*;

public class Admin {
    private byte choice;
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";

    public Admin() {
        byte choice1;
        // label: while (true) {
            System.out.println(
                    "\n......................................................................................................................................\n\n\n*****   Welcome Admin   *****\n\n\nAdmin Panel\n\n1. Add Student\n2. Add Result\n3. Update Student\n4. Update Result\n5. Delete Record\n6. Go to HomePage\n7. Exit\n\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextByte();
            if (choice == 1) {
                new AddStudent();
                // break;
            } else if (choice == 2) {
                new AddResult();
                // break;
            } else if (choice == 3) {
                new UpdateStudent();
                // break;
            } else if (choice == 4) {
                new UpdateRes();
                // break;
            } else if (choice == 5) {
                new Delete();
                // break;
            } else if (choice == 6) {
                HomePage home = new HomePage();
            } else if (choice == 7) {
                System.exit(0);
            } else {
                System.out.println("Invalid Selection");
                // break;
            }
        }

    }

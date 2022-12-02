import java.util.Scanner;

import com.mysql.cj.xdevapi.UpdateResult;

import java.sql.*;

public class Admin {
    private byte choice;
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";

    public Admin() {
        byte choice1; 
        while (true) {
            System.out.println(
                    "\n\n\n\n*****   Welcome Admin   *****\n\n\nAdmin Panel\n\n1. Add Student\n2. Add Result\n3. Update Result\n4. Delete Record\n5. Exit\n6. Go to HomePage\n\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextByte();
            if (choice == 1) {
                new AddStudent();
                break;
            } else if (choice == 2) {
                new AddResult();
                break;
            } else if (choice == 3) {
                UpdateRes u = new UpdateRes();
                break;
            } else if (choice == 4) {
                new Delete();
                break;
            } else if (choice == 5) {
                System.exit(0);
            } else if (choice == 6) {
                HomePage home = new HomePage();
            } else {
                System.out.println("Invalid Selection");
                break;
            }
            System.out.println("\n\n\nEnter Your Selection:\n1. Go Home\n2. Go to Admin Panel \n3. Exit Program");
            choice1 = sc.nextByte();
            if (choice == 3) {
                System.exit(0);
            } else if (choice == 1) {
                Aa: while (choice == 1) {
                    Admin admin = new Admin();
                }
        }
    }
}

    // public static void main(String[] args) {
    //     Admin r = new Admin();
    // }
}
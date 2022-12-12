import java.util.Scanner;
import java.sql.*;

public class Delete {
    Scanner sc = new Scanner(System.in);
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";
    // Program Variables
    char choice;
    String RollNumber;

    public Delete() {
        System.out.print("\n\n1. Delete Result\n2. Delete Student and Result\n\nEnter your choice :");
        choice = sc.next().charAt(0);
        sc.nextLine();
        if (choice == '1') {
            DeleteResult();
        } else if (choice == '2') {
            DeleteBoth();
        } else {
            System.out.println("\nInvalid Choice");
        }
        // To go back to Admin Panel after deleting record from database 
        Admin admin = new Admin();

    }

    void DeleteResult() {
        System.out.print("\nEnter Roll Number : ");
        RollNumber = sc.nextLine();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("\nConnected Database");
            ResultSet rs = st.executeQuery("select * from result where rollNo ='" + RollNumber + "'");
            // if roll number exist in result table then delete it
            if (rs.next()) {
                st.executeUpdate("delete from result where rollNo='" + RollNumber + "'");
                System.out.println("\nResult deleted Successfully from Database");
            }// if roll number doesn't exist in result table then print error message 
            else {
                System.out.print("\nRoll Number doesn't exist in our database");
            }
        }// if connection error occurs then print error message 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nConnection error");
        }
    }

    void DeleteBoth() {
        System.out.print("\nEnter Roll Number : ");
        RollNumber = sc.nextLine();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("\nConnected Database");
            ResultSet rs = st.executeQuery("select * from student where rollNo ='" + RollNumber + "'");
            // if roll number exist in student table then delete it and also delete it from result table
            if (rs.next()) {
                st.executeUpdate("delete from result where rollNo='" + RollNumber + "'");
                st.executeUpdate("delete from student where rollNo='" + RollNumber + "'");
                System.out.println("\nStudent and Result deleted Successfully from Database");
            }// if roll number doesn't exist in student table and result table then print error message 
            else {
                System.out.print("\nRoll Number doesn't exist in our database");
            }
        }// if connection error occurs then print error message 
        catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
    // public static void main(String[] args) {
    //     Delete d = new Delete();
    // }
}

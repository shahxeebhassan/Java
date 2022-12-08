import java.util.Scanner;
import java.sql.*;

public class Delete {
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";
    byte choice;
    String RollNumber;

    public Delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\n1. Delete Result\n2. Delete Student and Result\nEnter your choice :");
        choice = sc.nextByte();
        if (choice == 1) {
            DeleteResult();
        } else if (choice == 2) {
            DeleteBoth();
        } else {
            System.out.println("Invalid Choice");
        }

    }

    void DeleteResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        RollNumber = sc.nextLine();
        // this.RollNumber = RollNumber;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("Connected Database");
            ResultSet rs = st.executeQuery("select * from result where rollNo ='" + RollNumber + "'");
            if (rs.next()) {
                st.executeUpdate(
                        "delete from result where rollNo='" + RollNumber + "'");
                System.out.println("Result deleted Successfully from Database");
            } else {
                System.out.print("Roll Number doesn't exist in our database");
                // setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    void DeleteBoth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        RollNumber = sc.nextLine();
        // this.RollNumber = RollNumber;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("Connected Database");
            ResultSet rs = st.executeQuery("select * from student where rollNo ='" + RollNumber + "'");
            if (rs.next()) {
                st.executeUpdate(
                        "delete from result where rollNo='" + RollNumber + "'");
                st.executeUpdate(
                        "delete from student where rollNo='" + RollNumber + "'");
                System.out.println("Student and Result deleted Successfully from Database");
            } else {
                System.out.print("Roll Number doesn't exist in our database");
                // setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
    public static void main(String[] args) {
        Delete d = new Delete();
    }
}
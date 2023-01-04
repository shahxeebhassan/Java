import java.util.Scanner;
import java.sql.*;
public class Staff {
    Scanner sc = new Scanner(System.in);
    int ID;
    String name;
    String designation;
    int age;
    int lec;
    String db_Url = "jdbc:mysql://localhost:3306/ems";
    String db_User = "root";
    String db_Password = "";
    int choice;
    public Staff() {
        System.out.println("\n1. Add Staff\n2. Update Staff\n3. Delete Staff");
        choice = sc.nextInt();
        if (choice == 1) {
            AddStaff();
        } else if (choice == 2) {
            UpdateStaff();
        } else if (choice == 3) {
            DeleteStaff();
        }
    }
    private void DeleteStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staff ID : ");
        ID = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url,db_User, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from staff where ID ='" + ID + "'");
            if (rs.next()) {
                st.executeUpdate("delete from staff where ID='" + ID + "'");
                System.out.println("Staff deleted Successfully from Database");
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
    private void UpdateStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staff ID : ");
        ID = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url,db_User, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from staff where ID ='" + ID + "'");
            if (rs.next()) {
                System.out.println("Enter Staff Name : ");
                name = sc.nextLine();
                System.out.println("Enter Staff Designation : ");
                designation = sc.nextLine();
                System.out.println("Enter Staff Age : ");
                age = sc.nextInt();
                System.out.println("Enter Staff Lectures : ");
                lec = sc.nextInt();
                st.executeUpdate("update staff set name = '" + name + "', designation = '" + designation + "', age = '" + age + "', lec = '" + lec + "' where ID = '" + ID + "'");
                System.out.println("Staff updated Successfully to Database");
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
    private void AddStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staff ID : ");
        ID = sc.nextInt();
        System.out.println("Enter Staff Name : ");
        name = sc.nextLine();
        System.out.println("Enter Staff Designation : ");
        designation = sc.nextLine();
        System.out.println("Enter Staff Age : ");
        age = sc.nextInt();
        System.out.println("Enter Staff Lectures : ");
        lec = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url,db_User, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from staff where ID ='" + ID + "'");
            if (rs.next()) {
                System.out.println("ID already exists in our database");
            } else {
                st.executeUpdate("insert into staff values('" + ID + "','" + name + "','" + designation + "','" + age + "','" + lec + "')");
                System.out.println("Staff added Successfully to Database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
}

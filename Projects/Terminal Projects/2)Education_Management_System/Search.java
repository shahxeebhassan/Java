import java.util.Scanner;
import java.sql.*;

public class Search {
    Scanner sc = new Scanner(System.in);
    
    int ID;
    String db_Url = "jdbc:mysql://localhost:3306/ems";
    String db_Username="root";
    String db_Password="Affi@786";
    int choice;
    public Search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Search Student\n2. Search Hostel \n 3. Search Faculty \n 4. Search Staff");
        choice = sc.nextInt();
        if (choice == 1) {
            SearchStudent();
        } else if (choice == 2) {
            SearchHostel();
        }
        else if (choice == 3) {
            SearchFaculty();
        }
        else if (choice == 4) {
            SearchStaff();
        }
        else{
            System.out.println("Invalid Selection");
        }
    }

    private void SearchStaff() {
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_Username, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from staff where ID ='" + ID + "'");
            if (rs.next()) {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Designation : " + rs.getString(3));
                System.out.println("Age : " + rs.getInt(4));
                System.out.println("Lectures : " + rs.getInt(5));
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    private void SearchFaculty() {
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_Username, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from faculty where ID ='" + ID + "'");
            if (rs.next()) {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Department Name : " + rs.getString(2));
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    private void SearchHostel() {
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_Username, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from hostel where ID ='" + ID + "'");
            if (rs.next()) {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Cell No : " + rs.getString(3));
                System.out.println("Section : " + rs.getString(4));
                System.out.println("Room No : " + rs.getString(5));
                System.out.println("Block : " + rs.getString(6));
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    private void SearchStudent() {
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_Username, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where ID ='" + ID + "'");
            if (rs.next()) {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Cell No : " + rs.getString(3));
                System.out.println("Section : " + rs.getString(4));
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    public static void main(String[] args) {
        Search s = new Search();
    }

}

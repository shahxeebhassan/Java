import java.util.Scanner;

import java.sql.*;

public class Faculty {

    int ID;
    String Depart_Name;
    String db_Url = "jdbc:mysql://localhost:3306/ems";
    String db_User = "root";
    String db_Password = "";
    int choice;

    public Faculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Add Faculty\n2. Update Faculty\n3. Delete Faculty");
        choice = sc.nextInt();
        if (choice == 1) {
            AddFaculty();
        } else if (choice == 2) {
            UpdateFaculty();
        } else if (choice == 3) {
            DeleteFaculty();
        }
    }

    public void DeleteFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        // this.RollNumber = RollNumber;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from faculty where ID ='" + ID + "'");
            if (rs.next()) {
                st.executeUpdate(
                        "delete from faculty where ID='" + ID + "'");
                System.out.println("Faculty deleted Successfully from Database");
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    public void UpdateFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Depart_Name : ");
        Depart_Name = sc.nextLine();
        System.out.println("Enter ID : ");
        ID = sc.nextInt();

        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            st.executeUpdate("update faculty set ID='" + ID + "',Depart_Name='" + Depart_Name + "'");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AddFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Depart_Name : ");
        Depart_Name = sc.nextLine();
        System.out.println("Enter ID : ");
        ID = sc.nextInt();

        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            st.executeUpdate("insert into faculty(ID,Depart_Name) values('" + ID + "','" + Depart_Name + "')");
            System.out.println("Faculty Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Faculty();
    }
}

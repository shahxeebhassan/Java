import java.util.*;
import java.sql.*;

public class Hostel {

    int ID;
    String Name;
    String Cell_No;
    String sec;
    String room;
    String block;
    String db_Url = "jdbc:mysql://localhost:3306/ems";
    String db_User = "root";
    String db_Password = "";
    int choice;

    public Hostel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Add Hostel details\n2. Update Hostel details\n3. Delete Hostel details");
        choice = sc.nextInt();
        if (choice == 1) {
            AddHostelDetails();
        } else if (choice == 2) {
            UpdateHostelDetails();
        } else if (choice == 3) {
            DeleteHostelDetails();
        }
    }

    public void DeleteHostelDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        // this.ID = ID;
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from hostel where ID ='" + ID + "'");
            if (rs.next()) {
                st.executeUpdate(
                        "delete from hostel where ID='" + ID + "'");
                System.out.println("Student deleted Successfully from Database");
            } else {
                System.out.print("ID doesn't exist in our database");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    public void UpdateHostelDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        Name = sc.nextLine();
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Cell Number : ");
        Cell_No = sc.nextLine();
        System.out.println("Enter room : ");
        room = sc.next();
        System.out.println("Enter block : ");
        block = sc.next();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            st.executeUpdate("update hostel set ID='" + ID + "',Name='" + Name + "',Cell_Number='" + Cell_No
                    + "', Section='" + sec + "room=" + room + "block=" + block + "'");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    public void AddHostelDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        Name = sc.nextLine();
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        System.out.println("Enter Cell Number : ");
        Cell_No = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter room : ");
        room = sc.next();
        System.out.println("Enter block : ");
        block = sc.next();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            st.executeUpdate(
                    "insert into hostel(ID,Name,Cell_Number,Section,room,block) values('" + ID + "','" + Name + "','"
                            + Cell_No + "','" + sec + "','" + room + "','" + block + "')");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

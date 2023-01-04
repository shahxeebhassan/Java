import java.util.Scanner;
import java.sql.*;

public class Student {
    int ID;
    String Name;
    String Cell_No;
    String sec;
    String db_Url = "jdbc:mysql://localhost:3306/ems";
    String db_User = "root";
    String db_Password = "Affi@786";
    int choice;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Add Student\n2. Update Student\n3. Delete");
        choice = sc.nextInt();
        if (choice == 1) {
            AddStudent();
        } else if (choice == 2) {
            UpdateStudent();
        } else if (choice == 3) {
            DeleteStudent();
        }
    }

    public void DeleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID : ");
        ID = sc.nextInt();
        // this.RollNumber = RollNumber;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("Connected Database");
            ResultSet rs = st.executeQuery("select * from student where ID ='" + ID + "'");
            if (rs.next()) {
                st.executeUpdate(
                        "delete from student where id='" + ID + "'");
                System.out.println("Student deleted Successfully from Database");
            } else {
                System.out.print("ID doesn't exist in our database");
                // setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }

    public void UpdateStudent() {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Add Student");
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        Name = sc.nextLine();
        // this.program = program;
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        sc.nextLine();
        // this.semester = semester;
        System.out.println("Enter Cell Number : ");
        Cell_No = sc.nextLine();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            st.executeUpdate("update student set ID='" + ID + "',Name='" + Name + "',Cell_Number='" + Cell_No
                    + "', Section='" + sec + "'");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    public void AddStudent() {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Add Student");
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        Name = sc.nextLine();
        // this.program = program;
        System.out.println("Enter ID : ");
        ID = sc.nextInt();
        sc.nextLine();
        // this.semester = semester;
        System.out.println("Enter Cell Number : ");
        Cell_No = sc.nextLine();
        System.out.println("Enter section :");
        sec = sc.nextLine();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            st.executeUpdate("insert into student(ID,Name,Cell_Number,Section) values('" + ID + "','" + Name + "','"
                    + Cell_No + "','" + sec + "')");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}

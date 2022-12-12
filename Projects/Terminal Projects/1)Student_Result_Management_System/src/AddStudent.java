import java.util.Scanner;
import java.sql.*;
public class AddStudent {
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";
    // Add Student
    String program;
    String semester;
    String RollNumber;
    String name;
    String gender;
    String fatherName;

    public AddStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Program : ");
        program = sc.nextLine();
        System.out.println("Enter Semester : ");
        semester = sc.next();
        sc.nextLine();
        System.out.println("Enter Roll Number : ");
        RollNumber = sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Father Name : ");
        fatherName = sc.nextLine();
        System.out.println("Enter your gender: ");
        gender = sc.next();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            System.out.println("Connected Database");
            Statement st = con.createStatement();
            st.executeUpdate("insert into student(rollNo,program,semester,name,gender,fatherName) values('" + RollNumber
                    + "','" + program + "','" + program + "','" + semester + "','" + gender + "','" + fatherName
                    + "')");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println("Roll Number already exists");
            Admin admin = new Admin();
        }
    }
    public static void main(String[] args) {
        AddStudent addStudent = new AddStudent();
    }
}

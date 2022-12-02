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
        // System.out.println("Add Student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Program : ");
        program = sc.nextLine();
        // this.program = program;
        System.out.println("Enter Semester : ");
        semester = sc.nextLine();
        // this.semester = semester;
        System.out.println("Enter Roll Number : ");
        RollNumber = sc.nextLine();
        // this.RollNumber = RollNumber;
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        // this.name = name;
        System.out.println("Enter Father Name : ");
        fatherName = sc.nextLine();
        System.out.println("Enter your gender: ");
        gender = sc.nextLine();
        // this.fatherName = fatherName;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            System.out.println("Connected Database");
            Statement st = con.createStatement();
            st.executeUpdate("insert into student(program,branch,rollNo,name,gender,fatherName) values('" + program
                    + "','" + semester + "','" + RollNumber + "','" + name + "','" + gender + "','" + fatherName
                    + "')");
            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // public static void main(String[] args) {
    //     AddStudent addStudent = new AddStudent();
    // }
}

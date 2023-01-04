import java.util.Scanner;
import java.sql.*;
public class AddStudent {
    private Scanner sc = new Scanner(System.in);
    // Database Connection
    private String db_Url = "jdbc:mysql://localhost:3306/srm";
    private String db_User = "root";
    private String db_Password = "Affi@786";
    // Student Details
    private String program;
    private String semester;
    private String RollNumber;
    private String name;
    private String gender;
    private String fatherName;

    public AddStudent() {        
        addStudent();
        // Call Admin Class to show Admin Menu again after adding student details
        Admin admin = new Admin();
    }
    private void addStudent(){
        // Getting Student Details to Add in Database
        System.out.print("\nEnter Program : ");
        program = sc.nextLine();
        System.out.print("\nEnter Semester : ");
        semester = sc.next();
        sc.nextLine();
        System.out.print("\nEnter Roll Number : ");
        RollNumber = sc.nextLine();
        System.out.print("\nEnter Name : ");
        name = sc.nextLine();
        System.out.print("\nEnter Father Name : ");
        fatherName = sc.nextLine();
        System.out.print("\nEnter Gender: ");
        gender = sc.next();
        // Adding Student Details to Database
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            System.out.println("\nConnected Database");
            Statement st = con.createStatement();
            st.executeUpdate("insert into student(rollNo,program,semester,name,gender,fatherName) values('" + RollNumber
                    + "','" + program + "','" + program + "','" + semester + "','" + gender + "','" + fatherName
                    + "')");
            System.out.println("\nStudent Added Successfully");
        }// if connection fails 
        catch (Exception e) {
            e.printStackTrace();
            // System.out.println("Roll Number already exists");
            Admin admin = new Admin();
        }
    }
    // public static void main(String[] args) {
    //     AddStudent addStudent = new AddStudent();
    // }
}

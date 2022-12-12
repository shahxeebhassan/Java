import java.util.Scanner;
import java.sql.*;

public class UpdateStudent {
    // Database Connection
    private String db_Url = "jdbc:mysql://localhost:3306/srm";
    private String db_User = "root";
    private String db_Password = "Affi@786";
    // Student Details
    private String rollNumber;
    private String name;
    private String fatherName;
    private String program;
    private String gender;
    private String semester;

    public UpdateStudent() {
        // Getting Student Details to Update in Database 
        updateStudent();
        Admin ad = new Admin();
    }
    private void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Roll Number : ");
        rollNumber = sc.nextLine();
        System.out.print("\nEnter Name : ");
        name = sc.nextLine();
        System.out.print("\nEnter Father Name : ");
        fatherName = sc.nextLine();
        System.out.print("\nEnter Program : ");
        program = sc.nextLine();
        System.out.print("\nEnter Semester : ");
        semester = sc.nextLine();
        System.out.print("\nEnter your gender :");
        gender = sc.nextLine();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("\nConnected Database");
            ResultSet rs = st.executeQuery("select * from student where rollNo ='" + rollNumber + "'");
            // If Roll Number exists in database then update student details 
            if (rs.next()) {
                st.executeUpdate("update student set rollNo='" + rollNumber + "',program='" +program + "',semester='"
                        + semester
                        + "',name='" + name + "',gender='" + gender + "',fatherName='" + fatherName + "' where rollNo='"
                        + rollNumber + "'");
                System.out.println("\nResult Updated Successfully");
            }// If Roll Number doesn't exist in database then show error message 
            else {
                System.out.println("\nRoll Number doesn't exist in our database");
                // setVisible(false);
            }
        }// If connection fails  
        catch (Exception e) {
            e.printStackTrace();
            System.out.print("\nConnection error");
        }
    }
}

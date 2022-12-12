import java.util.Scanner;
import java.sql.*;

public class UpdateStudent {
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";
    // Student Details
    String rollNumber;
    String name;
    String fatherName;
    String program;
    String gender;
    String semester;

    public UpdateStudent() {
        // Getting Student Details to Update in Database 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        rollNumber = sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Father Name : ");
        fatherName = sc.nextLine();
        System.out.println("Enter Program : ");
        program = sc.nextLine();
        System.out.println("Enter Semester : ");
        semester = sc.nextLine();
        System.out.println("Enter your gender :");
        gender = sc.nextLine();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("Connected Database");
            ResultSet rs = st.executeQuery("select * from student where rollNo ='" + rollNumber + "'");
            // If Roll Number exists in database then update student details 
            if (rs.next()) {
                st.executeUpdate("update result set rollNo='" + rollNumber + "',program='" + program + "',semester='"
                        + semester
                        + "',name='" + name + "',gender='" + gender + "',fatherName='" + fatherName + "' where rollNo='"
                        + rollNumber + "'");
                System.out.println("Result Updated Successfully");
            }// If Roll Number doesn't exist in database then show error message 
            else {
                System.out.print("Roll Number doesn't exist in our database");
                // setVisible(false);
            }
        }// If connection fails  
        catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
}

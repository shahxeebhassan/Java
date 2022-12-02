import java.util.Scanner;
import java.sql.*;

public class UpdateRes {
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";
    String RollNumber;
    // Add Result
    String subject1;
    String subject2;
    String subject3;
    String subject4;
    String subject5;
    String subject6;

    public UpdateRes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        RollNumber = sc.nextLine();
        System.out.println("Enter Marks in Programming Fundamentals: ");
        subject1 = sc.nextLine();
        System.out.println("Enter Marks in ICT: ");
        subject2 = sc.nextLine();
        System.out.println("Enter Marks in Physics: ");
        subject3 = sc.nextLine();
        System.out.println("Enter Marks in Islamiyat: ");
        subject4 = sc.nextLine();
        System.out.println("Enter Marks in Calculus: ");
        subject5 = sc.nextLine();
        System.out.println("Enter Marks in English: ");
        subject6 = sc.nextLine();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("Connected Database");
            ResultSet rs = st.executeQuery("select * from student where rollNo ='" + RollNumber + "'");
            if (rs.next()) {
                st.executeUpdate("update result set pf='" + subject1 + "',ict='" + subject2 + "',phy='" + subject3
                        + "',isl='" + subject4 + "',calculus='" + subject5 + "',eng='" + subject6 + "' where rollNo='"
                        + RollNumber + "'");
                System.out.println("Result Updated Successfully");
            } else {
                System.out.print("Roll Number doesn't exist in our database");
                // setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
    }
}

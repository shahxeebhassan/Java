import java.util.Scanner;
import java.sql.*;

public class UpdateRes {
    // Database Connection
    private String db_Url = "jdbc:mysql://localhost:3306/srm";
    private String db_User = "root";
    private String db_Password = "Affi@786";
    private String RollNumber;
    // Result Details
    private String subject1;
    private String subject2;
    private String subject3;
    private String subject4;
    private String subject5;
    private String subject6;

    public UpdateRes() {
        updateStudent();
        Admin ad = new Admin();
    }
    private void updateStudent(){
         // Getting Result Details to update in database 
         Scanner sc = new Scanner(System.in);
         System.out.print("\nEnter Roll Number : ");
         RollNumber = sc.nextLine();
         System.out.print("\nEnter Marks in Programming Fundamentals: ");
         subject1 = sc.nextLine();
         System.out.print("\nEnter Marks in ICT: ");
         subject2 = sc.nextLine();
         System.out.print("\nEnter Marks in Physics: ");
         subject3 = sc.nextLine();
         System.out.print("\nEnter Marks in Islamiyat: ");
         subject4 = sc.nextLine();
         System.out.print("\nEnter Marks in Calculus: ");
         subject5 = sc.nextLine();
         System.out.print("\nEnter Marks in English: ");
         subject6 = sc.nextLine();
         try {
             Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
             Statement st = con.createStatement();
             System.out.println("\nConnected Database");
             ResultSet rs = st.executeQuery("select * from student where rollNo ='" + RollNumber + "'");
             // If Roll Number exists in database then update result
             if (rs.next()) {
                 st.executeUpdate("update result set pf='" + subject1 + "',ict='" + subject2 + "',phy='" + subject3+ "',isl='" + subject4 + "',calculus='" + subject5 + "',eng='" + subject6 + "' where rollNo='"+ RollNumber + "'");
                 System.out.println("\nResult Updated Successfully");
             }// If Roll Number doesn't exist in database then show error message 
             else {
                 System.out.println("\nRoll Number doesn't exist in our database");
                 // setVisible(false);
             }
         } // If Connection is not established then show error message
         catch (Exception e) {
             e.printStackTrace();
             System.out.print("\nConnection error");
         }
    }
}

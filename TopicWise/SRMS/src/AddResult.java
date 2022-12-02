import java.util.Scanner;
import java.sql.*;

public class AddResult {
    // Database Connection
    String db_Url = "jdbc:mysql://localhost:3306/srm";
    String db_User = "root";
    String db_Password = "Affi@786";
    // Add Result
    String RollNumber;
    String subject1;
    String subject2;
    String subject3;
    String subject4;
    String subject5;
    String subject6;

    public AddResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        RollNumber = sc.nextLine();
        // this.RollNumber = RollNumber;
        // Scanner sc = new Scanner(System.in);
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
                st.executeUpdate("insert into result(rollNo,pf,ict,phy,isl,calculus,eng)values('" + RollNumber + "','"
                        + subject1 + "','" + subject2 + "','" + subject3 + "','" + subject4 + "','" + subject5 + "','"
                        + subject6 + "')");
                System.out.println("Result Added Successfully");
            } else {
                System.out.print("Roll Number doesn't exist in our database");
                // setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Connection error");
        }
        // }
    }
}
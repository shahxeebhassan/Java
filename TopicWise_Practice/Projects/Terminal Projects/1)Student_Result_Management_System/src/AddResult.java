import java.util.Scanner;
import java.sql.*;

public class AddResult {
    Scanner sc = new Scanner(System.in);
    // Database Connection
    private String db_Url = "jdbc:mysql://localhost:3306/srm";
    private String db_User = "root";
    private String db_Password = "Affi@786";
    // Result Details
    private int RollNumber;
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;
    private int subject6;
    //Default Constructor that will be called when object is created
    public AddResult() {
        AddResult();
        // Calling Admin Class to go back to Admin Panel after adding result
        new Admin();
    }
    // public static void main(String[] args) {
    //     new AddResult();
    // }
    private void AddResult() {
        System.out.print("\nEnter Roll Number : ");
        RollNumber = sc.nextInt();
        System.out.print("\nEnter Marks in Programming Fundamentals: ");
        subject1 = sc.nextInt();
        System.out.print("\nEnter Marks in ICT: ");
        subject2 = sc.nextInt();
        System.out.print("\nEnter Marks in Physics: ");
        subject3 = sc.nextInt();
        System.out.print("\nEnter Marks in Islamiyat: ");
        subject4 = sc.nextInt();
        System.out.print("\nEnter Marks in Calculus: ");
        subject5 = sc.nextInt();
        System.out.print("\nEnter Marks in English: ");
        subject6 = sc.nextInt();
        // Inserting Result in Database using JDBC
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("\nConnected Database");
            ResultSet rs = st.executeQuery("select * from student where rollNo ='" + RollNumber + "'");
            // Checking if Roll Number exists in database
            if (rs.next()) {
                st.executeUpdate("insert into result(rollNo,pf,ict,phy,isl,calculus,eng)values('" + RollNumber + "','"+ subject1 + "','" + subject2 + "','" + subject3 + "','" + subject4 + "','" + subject5 + "','"+ subject6 + "')");
                System.out.println("\nResult Added Successfully");
            }// If Roll Number doesn't exist in database
            else {
                System.out.print("\nRoll Number doesn't exist in our database");
            }
        }// If Connection is not established
         catch (Exception e) {
            e.printStackTrace();
            System.out.print("\nConnection error");
        }
    }
}
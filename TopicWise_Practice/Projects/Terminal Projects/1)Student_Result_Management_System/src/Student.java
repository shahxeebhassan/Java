import java.util.Scanner;
import java.sql.*;

public class Student {
    Scanner sc = new Scanner(System.in);
    private char choice;
    // Database Connection
    private String db_Url = "jdbc:mysql://localhost:3306/srm";
    private String db_User = "root";
    private String db_Password = "Affi@786";
    // Student Details
    private String rollNumber;
    private int total;

    public Student() {
        System.out.print("\n\n\n\n*****   Welcome Student   *****\n\n\nEnter your Roll Number to see your Result :");
        Search();
        while (true) {
            System.out.println("\n\n\nEnter Your Selection:\n1. Search Again\n2. Go Home \n3. Exit Program");
            choice = sc.next().charAt(0);
            if (choice == '1') {
                Student student = new Student();
            } else if (choice == '2') {
                HomePage homePage = new HomePage();
            } else if (choice == '3') {
                System.exit(0);
            } else {
                System.out.println("\nInvalid Selection");
                Student student = new Student();
            }
        }
    }

    private void Search() {
        rollNumber = sc.nextLine();
        try {
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            // System.out.println("\nDatabase Connected");
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='" + rollNumber
                    + "' and result.rollNo='" + rollNumber + "'");
            if (rs.next()) {
                System.out.print("\n\n\nRoll Number : " + rs.getString(1));
                System.out.print("\t\t\t\tName             : " + rs.getString(4));
                System.out.print("\n\nGender      : " + rs.getString(5));
                System.out.print("\t\t\t\tFather Name      : " + rs.getString(6));
                System.out.print("\n\nProgram     : " + rs.getString(2));
                System.out.print("\t\t\t\tSemester         : " + rs.getString(3));
                System.out.print("\n\nProgramming : " + rs.getInt(8));
                System.out.print("\t\t\t\tICT              : " + rs.getInt(9));
                System.out.print("\n\nPhysics     : " + rs.getInt(10));
                System.out.print("\t\t\t\tIslamic Studies  : " + rs.getInt(11));
                System.out.print("\n\nCalculus    : " + rs.getInt(12));
                System.out.print("\t\t\t\tEnglish          : " + rs.getInt(13));
                total = rs.getInt(8) + rs.getInt(9) + rs.getInt(10) + rs.getInt(11) + rs.getInt(12) + rs.getInt(13);
                if (rs.getInt(8) < 60 || rs.getInt(9) < 60 || rs.getInt(10) < 60 || rs.getInt(11) < 60
                        || rs.getInt(12) < 60 || rs.getInt(13) < 60) {
                    System.out.println("\n\nTotal       : " + total + "\t\t\t\tResult           : Fail");
                } else {
                    System.out.println("\n\nTotal       : " + total + "\t\t\t\tResult           : Pass");
                }
            } else {
                System.out.println("\nRoll Number Not Found");
            }
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null, "Connection Failed");
            e.printStackTrace();
            System.out.println("Connection Failed");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}

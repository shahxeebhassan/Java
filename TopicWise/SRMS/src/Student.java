import java.util.Scanner;
import java.sql.*;

public class Student {
    private byte choice;
    // private String RollNumber;
    // Database Connection
    private String db_Url = "jdbc:mysql://localhost:3306/srm";
    private String db_User = "root";
    private String db_Password = "Affi@786";
    // Student Details
    private String rollNumber;
    private String program;
    private String semester;
    private String name;
    private String gender;
    private String fatherName;
    // Result Details
    private String subject1;
    private String subject2;
    private String subject3;
    private String subject4;
    private String subject5;
    private String subject6;
    private String pass;
    private String totalMarks;

    public Student() {
        System.out.println(
                "\n\n\n\n*****   Welcome Student   *****\n\n\nStudent Panel\n\n1. Search Your Result\n2. Go HomePage\n\nEnter your choice : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextByte();
        if (choice == 1) {
            // System.out.println("Add Result");
            Search(program, semester,name,gender,fatherName,subject1,subject2,subject3,subject4,subject5,subject6,pass,totalMarks);
            PrintResult();
        } else if (choice == 2) {
            HomePage Home = new HomePage();
        }
    }

    private void Search(String program, String semester,String name,String gender,String fatherName,String subject1,String subject2,String subject3,String subject4,String subject5,String subject6,String pass,String totalMarks) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Roll Number : ");
        rollNumber = sc.nextLine();
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db_Url, db_User, db_Password);
            Statement st = con.createStatement();
            System.out.println("Database Connected");
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollNo='" + rollNumber
                    + "' and result.rollNo='" + rollNumber + "'");
            if (rs.next()) {
                program=(rs.getString(2));
                this.program=program;
                semester=(rs.getString(3));
                this.semester=semester;
                name=(rs.getString(4));
                this.name=name;
                gender=(rs.getString(5));
                fatherName=(rs.getString(6));
                this.fatherName=fatherName;
                subject1=(rs.getString(8));
                this.subject1=subject1;
                subject2=(rs.getString(9));
                this.subject2=subject2;
                subject3=(rs.getString(10));
                this.subject3=subject3;
                subject4=(rs.getString(11));
                this.subject4=subject4;
                subject5=(rs.getString(12));
                this.subject5=subject5;
                subject6=(rs.getString(13));
                this.subject6=subject6;

                int s1 = Integer.parseInt(subject1);
                int s2 = Integer.parseInt(subject2);
                int s3 = Integer.parseInt(subject3);
                int s4 = Integer.parseInt(subject4);
                int s5 = Integer.parseInt(subject5);
                int s6 = Integer.parseInt(subject6);
                int total = s1 + s2 + s3 + s4 + s5 + s6;
                String s = String.valueOf(total);
                totalMarks = s;
                this.totalMarks=totalMarks;
                if (s1 < 60 || s2 < 60 || s3 < 60 || s4 < 60 || s5 < 60 || s6 < 60) {
                    pass="Fail";
                    this.pass=pass;
                } else {
                    pass="Pass";
                    this.pass=pass;
                }
            }else{
                System.out.println("Roll Number Not Found");
            }
        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null, "Connection Failed");
            e.printStackTrace();
            System.out.println("Connection Failed");
        }
    }
    public void PrintResult() {
        System.out.println("\n\nResult\n\nName: "+name+"\t\t\tFather Name: "+fatherName+"\nRoll Number: "+rollNumber+"\t\t\tGender: "+gender+"\nProgram: "+program+"\t\t\t\tSemester: "+semester+"\n\nProgramming Fundamentals: "+subject1+"\t\tICT: "+subject2+"\nApplied Physics: "+subject3+"\t\t\tIslamiyat: "+subject4+"\nCalculus: "+subject5+"\t\t\t\tEnglish: "+subject6+"\n\nTotal Marks: "+totalMarks+"\t\t\tPass: "+pass);
    }
    public static void main(String[] args) {
        Student s = new Student();
    }
}

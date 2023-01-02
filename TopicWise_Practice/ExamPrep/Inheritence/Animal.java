class Inherit {
    String name;
    int roll;
    String Sec;
    double cgpa;
    public void my(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("The name of student is " + this.name);
        System.out.println("The roll number of student is " +this.roll);
        System.out.println("The Section of student is " + this.Sec);
        System.out.println("The CGPA of student is " + this.cgpa);
        System.out.println();
        System.out.println();
        System.out.println();
    }
    Inherit (String name,int roll,String Sec,double cgpa){
        this.name = name;
        this.roll = roll;
        this.Sec = Sec;
        this.cgpa = cgpa;
    }
}
 public class Animal{
    public static void main(String[] args){
        Inherit Saad = new Inherit("M Saad", 1043, "M1", 4.8);
        Saad.my();
        Inherit Arsal = new Inherit("Arsal Bitch", 1017, "M1", 7.8);
        Arsal.my();
        Inherit Shahzaib = new Inherit("Shahzaib", 1005, "M1", 4.8);
        Shahzaib.my();
        Inherit Sagar = new Inherit("M Saad", 1043, "M1", 4.8);
        Sagar.my();
        // System.out.println(Saad.name+Saad.roll+Saad.Sec+Saad.cgpa);
    }

}
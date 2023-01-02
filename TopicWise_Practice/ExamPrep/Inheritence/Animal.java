class inherit {
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
    inherit (String name,int roll,String Sec,double cgpa){
        this.name = name;
        this.roll = roll;
        this.Sec = Sec;
        this.cgpa = cgpa;
    }
}
 public class Animal{
    public static void main(String[] args){
        inherit Saad = new inherit("M Saad", 1043, "M1", 4.8);
        Saad.my();
        inherit Arsal = new inherit("Arsal Bitch", 1017, "M1", 7.8);
        Arsal.my();
        inherit Shahzaib = new inherit("Shahzaib", 1005, "M1", 4.8);
        Shahzaib.my();
        inherit Sagar = new inherit("M Saad", 1043, "M1", 4.8);
        Sagar.my();
        // System.out.println(Saad.name+Saad.roll+Saad.Sec+Saad.cgpa);
    }

}
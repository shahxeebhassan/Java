/*
Create a class named 'Member' having the following members:
        Data members
        1 - Name
        2 - Age
        3 - Phone number
        4 - Address
        5 - Salary
        It also has a method named 'printSalary' which prints the salary of the members.
        Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/
class Member{
    String name;
    int age;
    long cntct_no;
    String address;
    int salary;
    void printSalary(){
        System.out.println("The salary is "+salary);
    }
}
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}
public class Question2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();
        emp.name="Shahzaib Hassan";
        emp.age=20;
        emp.address="Tayyiba Chakki,Bahawalpur";
        emp.cntct_no=
    }
}

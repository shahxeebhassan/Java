/*
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
*/

/*In the above example, declare the method of the parent class as private and then repeat the first two operations (You will get error in the third)*/

class parent{
    private void printp(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void printc(){
//        super.print();
        System.out.println("This is child class");
    }
}
public class Question1 {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
//        p.printp();//calling  parent class method by parent class object
//        p.printp();//calling child class method by parent class object
        c.printc();//calling child class method by child class object
//        c.printp();//calling parent class method by child class object
//        p = c;
//        parent a = new child();
//        a.print();
//        c.print();


    }
}

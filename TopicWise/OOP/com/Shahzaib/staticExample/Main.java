package com.Shahzaib.staticExample;

public class Main {
    public static void main(String[] args) {
        // Person shahzaib = new Person("Shahzaib Hassan", 20, 0, false);
        // Person Afnan = new Person("Afnan", 19, 0, false);
        // System.out.println(shahzaib.population);
        // System.out.println(Afnan.population);
        // Person.population = 11;
        // System.out.println(Person.population);
        //greet();//inside static method we cannot use any non static thing
        //A static method can only acces static data members and static methods
        fun();
        Main fun = new Main();
        fun.fun2();
        Person.msg();//we can access static method without creating an object of the class
        
    }
    static void fun(){
        // System.out.println("Hello");
        //greet();//cannt access non static method only way is to create an object of the class and then call the method using that object
        Main obj = new Main();
        obj.greet();//this is the way to access non static method inside static method
        obj.fun2();

    }
    void fun2(){
        System.out.println("Hello");
        greet();//can access non static method inside non static method
    }
    void greet() {
        System.out.println("Hello");
        // fun();//can access static method
    }
}

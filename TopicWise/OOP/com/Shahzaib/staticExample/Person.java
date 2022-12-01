package com.Shahzaib.staticExample;
public class Person {
    String name;
    int age;
    int salary;
    boolean isMarried;
    // int population = 0;
    static int population = 0; // static variable can be accessed without creating an object of the class
    //Similarly static methods can be accessed without creating an object of the class .Example is main method we don't need to create an object of the class to access it.
    Person(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Person.population+=1;
        Person.msg();
    }
    static void msg() {
        System.out.println("Hello world");
        //System.out.println(this.age);//we cannot use this keyword inside static method
        //System.out.println(age);//we cannot use non static variable inside static method
    }
}

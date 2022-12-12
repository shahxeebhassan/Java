package com.Shahzaib.Introduction;


class Family {
    String name;
    String designation;
    int age;
    String fatherName;

    // Constructor overloading
    Family() {
        //calling constructor from constructor
        this("Shahzaib", "Husband", 27, "Shabbir");
    }

    Family(String name, String designation, int age, String fatherName) {
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.fatherName = fatherName;
    }

    Family(String name, String designation, int age) {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    Family(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    Family(String name) {
        this.name = name;
    }

    void display() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println("Father Name: " + fatherName);
        System.out.println();
    }

    void display1() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println();
    }

    void changeName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }

}

public class Intro {
    /**
     * // * @param args
     */
    public static void main(String[] args) {
        Family me;
        me = new Family();
        me.changeName("Shah");
        System.out.println(me);
        // me.name = "Shahzaib";
        // me.designation = "Husband";
        // me.age = 20;
        // me.fatherName = "Shabbir";
        // System.out.println(me.name);
        // System.out.println(me.designation);
        // System.out.println(me.age);
        // System.out.println(me.fatherName);
        me.display();
        Family sweeto = new Family("Afnan", "Wife", 27, "Ismail");
        sweeto.display();
        Family mySon = new Family("Nh btaun ga", "Son", 1);
        mySon.display1();
        Family myDaughter = new Family("", "Daughter", -14);
        // myDaughter.display1();
        // for (int i = 0; i < 1000000; i++) {
        //     new Family();
        // }
    }
}

package com.Shahzaib.Inheritence;

class Shah {
    private int a = 10;

    public Shah() {
        System.out.println("Shah");
        a = 10;
        System.out.println(a);
    }

    public Shah(int a) {
        System.out.println("Shah");
        this.a = a;
        System.out.println(a);
    }
}

class Zaib extends Shah {
    int b = 20;

    Zaib(int a) {
        super(a);
        System.out.println("Zaib");

    }
}

public class Private {
    public static void main(String[] args) {
        Zaib zaib = new Zaib(10);// we are calling the constructor of the parent class with the help of super
                                 // keyword in the child class constructor

    }
}
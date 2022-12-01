package com.Shahzaib.staticExample;
// a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;
    // will only run for the first time when the first object of the class is created i.e when the class is loaded in the memory for the first time 
    static{
        System.out.println("I am inside static block");//static block is executed before the constructor
        b=a*11;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a + " " + obj.b);

        StaticBlock.b+=10;
        System.out.println(obj.a + " " + obj.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(obj.a + " " + obj.b);

    }
}

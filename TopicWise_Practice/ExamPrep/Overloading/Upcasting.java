class A {
    public void m1() {
        System.out.println("A.m1()");
    }
}
class B extends A {
    public void m1() {
        System.out.println("B.m1()");
    }
    public void m2() {
        System.out.println("B.m2()");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        // a.m2(); // Error
    }
    
}
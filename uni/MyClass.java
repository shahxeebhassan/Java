class Student{
    public void printlnt() {
        
    }
}

 class InnerMyClass extends Student {
    // public void PrintStu() {
    //     System.out.println("helol");
    // }
    
}
 class MyClass {

    public static void main(String[] args) {
        InnerMyClass obh= new InnerMyClass();
        obh.PrintStu();
    }
}
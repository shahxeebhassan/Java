package com.Shahzaib.staticExample;
// outer class cannot be static
// static public class InnerClasses {
//     public class First { }
// }

public class InnerClasses {
    static class First{//but inner class can b static
        String Name;
        public First(String Name){
            this.Name=Name;
        }
    }
    public static void main(String[] args) {
        First a = new First("Shahzaib");
        // error because inner class is dependent on outer so it needs obj of outer class
        First b = new First("Afnan");

    }
}
abstract class AbstractClass {
    AbstractClass() {
      //This is the constructor
      //This gets called when during object creation of child class. 
      System.out.println("This is the constructor of the parent abstract class. ");
    }
    final void finalmethod() {
      System.out.println("This method is a final method. You cannot override this method. ");
    }
    public abstract void abstractmethod();
  }
  public class AbstractClassExample extends AbstractClass {
    public void abstractmethod() {
      System.out.print("This is an example of an abstract method redefined inside child class. ");
    }
    public static void main(String[] args) {
      AbstractClass object = new AbstractClassExample();
      //We can not define an object of abstract class but we can refer to it.
      object.finalmethod(); //final method in java
      object.abstractmethod(); //calling the abstract method
    }
  }
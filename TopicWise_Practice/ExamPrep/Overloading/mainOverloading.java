public class mainOverloading {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        mainOverloading mo = new mainOverloading();
        mo.main("Shahzaib");
    }
    public static void main(String name) {
        System.out.println("Main with two args"+name);
    }
}

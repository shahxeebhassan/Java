public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // MainOverloading mo = new MainOverloading();
        MainOverloading.main("Shahzaib");
    }
    public static void main(String name) {
        System.out.println("Main with two args"+name);
    }
}

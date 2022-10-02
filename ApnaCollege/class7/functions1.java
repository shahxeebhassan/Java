package class7;
import java.util.Scanner;

public class functions1 {
    public static void PrintMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        PrintMyName(name);
    }
}

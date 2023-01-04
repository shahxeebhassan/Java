import java.util.Scanner;

public class StrinGSearch {
    public static void main(String[] args) {
        String name = "Afnan";
        System.out.println("Enter character to find: ");
        Scanner sc = new Scanner(System.in);
        char key = sc.next().charAt(0);
        System.out.println(srch(name, key));
    }
    public static boolean srch(String name ,char key) {
        if (name.length()==0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (key == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

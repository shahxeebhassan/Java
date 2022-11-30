import java.util.Scanner;

public class Student {
    byte choice;
    public Student(){
        System.out.println(
            "\n\n\n\n*****   Welcome Student   *****\n\n\nStudent Panel\n\n1. Search Your Result\n2. Exit\n\nEnter your choice : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextByte();
        if (choice == 1) {
            // System.out.println("Add Result");
            Search();
        } else if (choice == 2) {
            // System.out.println("Update Result");
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    private void Search() {
    }
}

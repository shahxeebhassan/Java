import java.util.Scanner;;

public class Admin {
    private byte choice;

    public Admin() {
        while (true) {
            System.out.println(
                    "\n\n\n\n*****   Welcome Admin   *****\n\n\nAdmin Panel\n\n1. Add Result\n2. Update Result\n3. Delete Result\n4. View all Results\n5. Exit\n\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextByte();
            if (choice == 1) {
                // System.out.println("Add Result");
                Add();
                break;
            } else if (choice == 2) {
                // System.out.println("Update Result");
                Update();
                break;
            } else if (choice == 3) {
                // System.out.println("Delete result");
                Delete();
                break;
            } else if (choice == 4) {
                // System.out.println("VIew all Results");
                View();
                break;
            }
            else if (choice==5) {
                exit();
                break;
            }
            else{
                System.out.println("Invalid Selection");
                break;
            }
        }
    }

    private void exit() {
    }

    public void Add() {
        System.out.println("Add Result");
    }
    public void Update() {
        System.out.println("Update Result");
    }
    public void Delete() {
        System.out.println("Delete Result");
    }
    public void View() {
        System.out.println("View all Result");
    }

}
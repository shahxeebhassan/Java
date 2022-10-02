<<<<<<< HEAD
package class10;

public class array1 {
    public static void main(String[] args) {
        int [] marks = new int [6];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 83;
        marks[4] = 85;
        marks[5] = 67;
        // marks[6] = 72;
        System.out.println(marks[0]);
=======
package ApnaCollege.class10;
import java.util.*;
public class array1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int ele=sc.nextInt();
>>>>>>> 9da6346901758d7f3dfcfa013949e6212403c4c6
    }
}

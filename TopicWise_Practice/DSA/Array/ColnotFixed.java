import java.util.Scanner;
public class ColnotFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {
            {6,5,3,2,1},
            {9,0,7},
            {1,2,3,4}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col= 0;col < arr[row].length;col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}

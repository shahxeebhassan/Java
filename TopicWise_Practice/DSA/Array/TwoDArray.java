import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[3][2];//First rows then columns , It is necessary to declare rows 
        
        // Or 

        // int [][] n = {
        //     {1,3,4,5}, // 0th index
        //     {23,4,5,5,5,5,5,5,5,5,3,55,4},// 1st index
        //     {45,4,2,1,3,5,6,777,7}// 2nd index
        // };

        for (int row = 0; row < num.length; row++) { // .length gives only no of rows
            for (int col = 0; col < num[row].length; col++) {
                num[row][col]=sc.nextInt();
            }
        }

        // for (int row = 0; row < num.length; row++) { // .length gives only no of rows
        //     for (int col = 0; col < num[row].length; col++) {
        //         System.out.print(num[row][col] + " ");
        //     }
        //     System.out.println();
        // }


        // for (int row = 0; row < num.length; row++) {
        //     System.out.print(Arrays.toString(num[row]));
        // }

        for (int[] is : num) {
            System.out.print(Arrays.toString(is));
        }
    }
}

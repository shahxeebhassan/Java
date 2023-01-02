// package class5;

import java.util.Scanner;

public class Invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

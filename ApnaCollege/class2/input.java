package com.class2;
//Firstly import this
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        
        Scanner sc2 = new Scanner(System.in);
        int a = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int b = sc3.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}

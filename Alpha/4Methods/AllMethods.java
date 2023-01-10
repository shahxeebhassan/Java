/**
 * Product
 */
import java.util.Scanner;
public class AllMethods {


//-----------------------------------------------------------------------------------------------

//returns product of two numbers
    public static int prodct(int a ,int b) {
        int sum = a * b;
        return sum;
    }

//-----------------------------------------------------------------------------------------------

//returns factorial of a number
    public static int factorial(int num) {
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact*=i;
        }
        return fact;
    }

//-----------------------------------------------------------------------------------------------

//To check prime Number 
//Not Optimized
    public static boolean isPrime(int num) {
        boolean prime = true;
        if (num<0) {
            num*=-1;
        }
        if (num==1) {
            System.out.println("Not Prime");
        }
        else{
            int mid = num/2;
            for (int i = 2; i <= mid; i++) {
                if (num%i==0) {
                    return false;
                }
            }
        }
        return prime;
    }

//optimized
public static boolean prime(int num) {
    // boolean count = true;
    if (num<0) {
        num*=-1;
    }
    if (num==1) {
        System.out.println("Not Prime");
    }
    else{
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                return false;
            }
        }
    }
    return true;
}

//Prime Numbers in range
public static void rangePrime(int num) {
    for (int i = 2; i <= num; i++) {
        if (prime(i)) {
            System.out.print(i + " ");
        }
    }
}

//-----------------------------------------------------------------------------------------------

//Convert From binary to Decimal
public static void biToDec(int num) {
    int dec = 0;
    byte pow=0;
    int temp = num;
    while (num!=0) {
        int ld = num % 10;
        dec += (ld*Math.pow(2, pow));
        pow++;
        num/=10;
    }
    System.out.println("Decimal of "+temp+ " is "+dec);
    return;
}

//-----------------------------------------------------------------------------------------------
// Convert from decimal to binary 

public static void decToBin(int num) {
    int  binary=0;
    byte pow = 0;
    int n=num;
    while (num!=0) {
        int rem = num % 2;
        binary+=rem*(int)Math.pow(10,pow);
        pow++;
        num/=2;
    }
    System.out.println("Binary form of "+n+" = "+ binary);
    // return binary;
}

//-----------------------------------------------------------------------------------------------

public static void main(String[] args) {
    int a = 7;
    // System.out.println(factorial(a));
    // System.out.println(isPrime(-4));
    // System.out.println(prime());
    // rangePrime(100);
    // biToDec(111);
    decToBin(a);
}

}
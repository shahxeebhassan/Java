/*
 * LeetcCode Question
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 133, -13, 1234, 121212, 2222 };
        // System.out.println(evenNumbers(arr));
        System.out.println(findNo(arr));
        System.out.println(countdigits(-10));
    }

    // public static int evenNumbers(int[] arr) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         int ic = 0;
    //         while (arr[i] != 0) {
    //             arr[i] /= 10;
    //             ic++;
    //         }
    //         if (ic % 2 == 0) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // Alternate Method 
    public static int findNo(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])==true) {
                count++;
            }
        }
        return count;
    }
    public static boolean isEven(int number) {
        int digits = countdigits(number);
        return digits%2==0;
    }
    // public static int countdigits(int number) {
    //     int dig =0;
    //     if (number==0) {
    //         return 1;
    //     }
    //     while (number!=0) {
    //         number/=10;
    //         dig++;
    //     }
    //     return dig;
    // }

    // By math finding digits  
    public static int countdigits(int num ) {
        if (num<0) {
            num*=-1;
        }
        return (int)(Math.log10(num)) + 1;  //but not taking negative values
    }

}

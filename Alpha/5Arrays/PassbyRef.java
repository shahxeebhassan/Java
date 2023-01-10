import java.util.Arrays;

public class PassbyRef {
    public static void main(String[] args) {
        int[] numbers ={89,86,85,63,23,45,65};
        System.out.println(Arrays.toString(numbers));
        update(numbers);
        // SO arrays are passed by reference in java
        System.out.println(Arrays.toString(numbers));

    }
    public static void update(int[] arr) {
        for (int i =0;i<arr.length;i++) {
            arr[i]+=2;
        }
    }
}

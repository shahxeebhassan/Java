import java.util.Arrays;

public class ArrayMutability {
    public static void main(String[] args) {
        int[] arr = {12,13,14,142};
        change(arr);
        System.out.println(Arrays.toString(arr));

        String[] names= {"Shahzaib","Afnan"};
        change(names);
        System.out.println(Arrays.toString(names));
    }
    public static void change (int[] ar){
        ar[0] = 2334;
    }
    public static void change (String[] ar){
        ar[0] = "Afnan";
        ar[1] = "Shahzaib";
    }
}

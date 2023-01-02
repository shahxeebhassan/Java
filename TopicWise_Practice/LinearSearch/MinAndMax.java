public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        minAndmax(arr);

    }
    public static void minAndmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
            if (arr[i]< min) {
                min =arr[i];
            }
        }
        System.out.println("Min "+min+" Max "+max);
    }
}

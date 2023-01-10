public class LinearSearch1 {
    public static void main(String[] args) {
        String[] names = {"shahzaib","afnan","sehrish","sabbiha"};
        System.out.println(srch(names, "afnan"));
    }
    public static int srch(String[] arr,String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}

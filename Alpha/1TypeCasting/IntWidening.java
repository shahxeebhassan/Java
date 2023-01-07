public class IntWidening {
    public static void main(String[] args) {
        System.out.println("Int to Long");
        int i = 34;
        long l = i;
        System.out.println("i = " + i);

        System.out.println("Int to Float");
        float f = i;
        System.out.println("i = " + i);

        System.out.println("Int to Double");
        double d = i;
        System.out.println("i = " + i);
    }
}

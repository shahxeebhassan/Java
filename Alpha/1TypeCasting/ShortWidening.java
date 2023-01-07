public class ShortWidening {
    public static void main(String[] args) {
        System.out.println("Short to Int");
        short s = 34;
        int i = s;
        System.out.println("s = " + s);

        System.out.println("Short to Long");
        long l = s;
        System.out.println("s = " + s);

        System.out.println("Short to Float");
        float f = s;
        System.out.println("s = " + s);

        System.out.println("Short to Double");
        double d = s;
        System.out.println("s = " + s);
    }
}

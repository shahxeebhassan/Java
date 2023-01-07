public class DoubleNarrowing {
    public static void main(String[] args) {
        double d = 34.56;
        System.out.println("Double to Float");
        float f = (float)d;
        System.out.println("d = " + d);

        System.out.println("Double to Long");
        long l = (long)d;
        System.out.println("d = " + d);

        System.out.println("Double to Int");
        int i = (int)d;
        System.out.println("d = " + d);

        System.out.println("Double to Short");
        short s = (short)d;
        System.out.println("d = " + d);

        System.out.println("Double to Byte");
        byte b = (byte)d;
        System.out.println("d = " + d);

        System.out.println("Double to Char");
        char c = (char)d;
        System.out.println("d = " + d);


    }
}

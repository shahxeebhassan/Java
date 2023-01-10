public class TypePromoExampl2 {
    public static void main(String[] args) {
        byte b = 42;
        //byte c = b * 2; // Error: incompatible types: possible lossy conversion from int to byte
        byte c = (byte) (b * 2); // OK
        System.out.println("c = " + c);
    }
}

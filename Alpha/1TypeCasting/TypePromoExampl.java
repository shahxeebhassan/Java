public class TypePromoExampl {
    public static void main(String[] args) {
        char a = 'b';
        byte b = 1;
        short c = 2;
        //short d = a + b + c; // char is promoted to int so gives error: incompatible types: possible lossy conversion from int to short
        short d = (short) (a + b + c);
        System.out.println(d);
    }
}

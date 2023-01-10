public class TypePromoExampl1 {
    public static void main(String[] args) {
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = i * f / d; // promoted to double
        System.out.println("result = " + result);
    }
}

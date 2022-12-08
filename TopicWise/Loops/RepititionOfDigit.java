public class RepititionOfDigit {
    public static void main(String[] args) {
        //count repitition of a digits
        long num = 1234323232323232323L;
        int digit = 3;
        int count = 0;
        while (num>0) {
            long rem = num%10;
            if (rem==digit) {
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}

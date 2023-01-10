public class TypePromotionChar {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        //char c = b-a;               //gives error: incompatible types: possible lossy conversion from int to char 
        //Reason: char is promoted to int
        int c = b-a;
        System.out.println(c);
    }
}

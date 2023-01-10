public class HollowRhombus {
    public static void main(String[] args) {
        int r = 7;
        int c=10;
        for (int i = 1; i <=r; i++) {
            for (int j = r-i; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c; j++) {
                if (i==1||i==r||j ==c||j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}

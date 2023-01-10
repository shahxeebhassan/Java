public class Patterns {

//-----------------------------------------------------------------------------------------------

//ZeroOne TRiangle

public static void zeroOneTriangle(int rows) {
    for (int row = 1; row <= rows; row++) {
        for (int col = 1; col <=row; col++) {
            if ((row+col)%2==0) {
                System.out.print(1);    
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
}

//-----------------------------------------------------------------------------------------------
//Solid Rhombus

public static void solidRhombus(int n) {
    for (int i = 1; i <=n; i++) {
        for (int j = n-i; j >=1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <=n; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

//-----------------------------------------------------------------------------------------------

//Hollow Rhombus
public static void HollowRhombus(int r,int c) {
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

//-----------------------------------------------------------------------------------------------

//Hollow Rectangle
public static void hollowRectangle(int rows,int cols) {
    for (int row = 1; row <=rows; row++) {
        for (int col = 1; col <=cols; col++) {
            if (col==1||col==cols||row==1 ||row==rows) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    System.out.println();
    }
}
//Hollow Rectangle Number

public static void hollowRectangleNo(int rows,int cols) {
    for (int row = 1; row <=rows; row++) {
        for (int col = 1; col <=cols; col++) {
            if (col==1||col==cols||row==1 ||row==rows) {
                System.out.print(col);
            }
            else{
                System.out.print(" ");
            }
        }
    System.out.println();
    }
}

//-----------------------------------------------------------------------------------------------

//Half Pyramid
public static void halfPyramid(int rows) {
    for (int row =  1; row <= rows; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

//Half Pyramid with No
public static void halfPyramidNo(int rows) {
    for (int row = 1; row <= rows; row++) {
        for (int col = 1; col <=row; col++) {
            System.out.print(col+" ");
        }
        System.out.println();
    }
}

//Half Pyramid Char
public static void halfPyramidChar(int rows) {
    char ch = 65;
    for (int row = 1; row <=rows; row++) {
        for (int col = 1; col <=row; col++,ch++) {
            System.out.print(ch+" ");
        }
    System.out.println();         
    }

}
//-----------------------------------------------------------------------------------------------

//Inverted Half Pyramid --Method 1
public static void invertedHalfPyramid(int rows) {
    for (int row = 1; row <=rows; row++) {
        for (int col = 1; col <=rows-row+1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
//Inverted Half Pyramid --Method 2

public static void invertedHalfPyramid1(int rows) {
            for (int row = rows; row >=1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
}

//Inverted Half Pyramid with Nos
public static void invertedHalfPyramidNo(int rows) {
    for (int row = rows; row >=1; row--) {
        for (int col = 1; col <=row; col++) {
            System.out.print(col+" ");
        }
        System.out.println();
    }
}

// Another Version
public static void InvertedHalfPyramidNo1(int rows) {
    int counter = rows*(rows+1) /2;
    for (int row = rows; row >=1; row--) {
        for (int col = 1; col <=row; col++,counter--) {
            System.out.print(counter+" ");
        }
        System.out.println();
    }
}
//Inverted Rotated Half Pyramid
public static void invertedRotatedHalfPyramid(int rows) {
    for (int row = 1; row <=rows; row++) {
        for (int col = rows-row; col >=1; col--) {
            System.out.print(" ");
        }
        for (int col = 1; col <=row; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
//-----------------------------------------------------------------------------------------------

//Floyd's Triangle

public static void floydTriangle(int rows) {
    int counter = 0;
    for (int row = 1; row <=rows; row++) {
        for (int col = 1; col <=row; col++,counter++) {
            System.out.print(counter+ " ");
        }
        System.out.println();
    }
}

//-----------------------------------------------------------------------------------------------

//Diamond

public static void diamond(int n) {
    for (int i = 1; i <=n; i++) {
        for (int j = n-i; j >=1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <=(2*i)-1; j++) {
           System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n; i >=1; i--) {
        for (int j = n-i; j >=1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <=(2*i)-1; j++) {
           System.out.print("*");
        }
        System.out.println();
    }
}

//-----------------------------------------------------------------------------------------------

//Butterfly

public static void butterfly(int n) {
    for (int i = 1; i <= n; i++) {
        // Half Pyramid
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (int j = 2*(n - i); j >= 1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (int j = 2*(n - i); j >= 1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}

//-----------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        butterfly(5);
        diamond(5);
        floydTriangle(5);
        halfPyramid(5);
        halfPyramidChar(5);
        halfPyramidNo(6);
        hollowRectangle(5,6);
        hollowRectangleNo(7,8);
        HollowRhombus(5, 6);
        invertedHalfPyramid(6);
        invertedHalfPyramid1(6);
        invertedHalfPyramidNo(7);
        invertedRotatedHalfPyramid(6);
        InvertedHalfPyramidNo1(5);
        solidRhombus(6);
        zeroOneTriangle(7);
        
    }
}
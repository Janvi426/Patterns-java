import java.util.*;
public class Patternswithfunc {
    
    // (1) hollow rectangle
    public static void hollow_rect(int totalRow, int totalCols){
        // outer loop (rows)
        for(int i=1; i<=totalRow; i++){
            // inner colums
            for(int j=1; j<=totalCols; j++){
                // cell (i,j)
                if(i==1 || i==totalRow || j==1 || j==totalCols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }

    // (2) inverted and rotated half pyramid
    public static void halfpyr(int n){
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }    
            System.out.println();
        }
    }

    // (3) inverted half pyramid with numbers
    public static void numPyr(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // (4) FLOYD'S triangle
    public static void floydTri(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                 System.out.print(counter + " ");
                 counter++;
            }
            System.out.println();  
        }
    }

    // (5)
    public static void zero_one_triangle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j) % 2 == 0){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}

    // (6) butterfly pattern
    public static void butterfly(int n){
        // first half code
        for(int i=1; i<=n; i++){
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
        System.out.println();
        }
        // second half code
        for(int i=n; i>=1; i--){
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    // (7) solid rhombus 
    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }
            for(int star=1; star<=n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // (8) hollow rhumbus (some space before hollow rectangle)
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars same as hollow rectangle
            for(int j=1; j<=n; j++){
                // cell (i,j)
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // (9) Diamond
    public static void diamond(int n){
        // upper triangle
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int star=1; star<=((2*i)-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower triangle inverted
        for(int i=n; i>=1; i--){         // also can be written as int i=n-1;
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int star=1; star<=((2*i)-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // (10) number whole pyramid with space
    public static void numPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int num=1; num<=i; num++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    // (11) palindromic pattern with number
    public static void palindrom(int n){
        for(int i=1; i<=n; i++){
            // space 
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            // descending order 
            for(int des=i; des>=1; des--){
                System.out.print(des);
            }
            // ascending order
            for(int asc=2; asc<=i; asc++){
                System.out.print(asc);
            }
            System.out.println();
        }
    }
    
    // MAIN FUNCTION
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        // (1)
        // System.out.print("Enter total rows of hollow rectangle : ");
        // int tr = sc.nextInt();
        // System.out.print("Enter total colums of hollow rectangle : ");
        // int tc = sc.nextInt(); 
        // hollow_rect(tr,tc);

        // (2)
        // System.out.print("Enter total rows of pyramid : ");
        // int r = sc.nextInt();
        // halfpyr(r); 

        // (3)
        // numPyr(5);

        // (4)
        // floydTri(8);
        
        // (5)
        // zero_one_triangle(5);

        // (6)
        // butterfly(4);

        // (7)
        // rhombus(5);

        // (8)
        // hollow_rhombus(7);

        // (9)
        // diamond(5);

        // (10)
        // numPyramid(5);

        // (11)
         palindrom(5);





    }
}

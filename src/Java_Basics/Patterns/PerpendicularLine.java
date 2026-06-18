package Java_Basics.Patterns;


public class PerpendicularLine {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i<2) System.out.print("*"+" ");
                else{
                    if(j==3){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
/*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print a star if it's the first row OR the middle column
                if (i == 1 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces to match the "* " width
                }
            }
            System.out.println(); // Move to the next line
        }

*/
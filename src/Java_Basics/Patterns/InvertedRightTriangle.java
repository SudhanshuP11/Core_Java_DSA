package Java_Basics.Patterns;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        int j1 =5;
        for(int i=1;i<=5;i++){
            for(int j=j1;j>0;j--){
                System.out.print("*"+" ");

            }
            j1=j1-1;
            System.out.println();
        }

    }
}

/*
*    optimized (5-i)+1 or6-i       for (int i = 1; i <= 5; i++) {
    // The loop runs (6 - i) times
    for (int j = 1; j <= (6 - i); j++) {
        System.out.print("* ");
    }
    System.out.println();
}
*
* */

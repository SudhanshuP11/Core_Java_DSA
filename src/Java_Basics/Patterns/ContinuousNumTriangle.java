package Java_Basics.Patterns;

public class ContinuousNumTriangle {
    public static void main(String[] args){
        int a=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
//                if(i<2) System.out.print(j);
//                else System.out.print(j+i+" ");
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}

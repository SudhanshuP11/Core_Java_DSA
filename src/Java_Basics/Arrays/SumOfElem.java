package Java_Basics.Arrays;

import java.util.Scanner;

public class SumOfElem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element of the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+i+" element: ");
            arr[i]=sc.nextInt();
        }
        double add =0;
//        for(int i=0;i<arr.length;i++){
//            add+=arr[i];
//        }
//        System.out.println("The addition of all elements of array: "+add);
        for(double num:arr){
            add+=num;
        }
        System.out.println("The addition of all elements of array: "+add);
    }
}

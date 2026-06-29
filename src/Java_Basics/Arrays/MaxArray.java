package Java_Basics.Arrays;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element of the array: ");
        int n = sc.nextInt();
        if(n<=0) return;
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+i+" element: ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        System.out.println("The max no. is : "+max);
    }
}

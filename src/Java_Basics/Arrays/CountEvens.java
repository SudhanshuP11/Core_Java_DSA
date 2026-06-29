package Java_Basics.Arrays;

import java.util.Scanner;

public class CountEvens {
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
        int count=0;
        for(int num:arr){
            if(Math.abs(num)%2==0) count++;
        }
        System.out.println("Then count of evens are: "+count);
    }
}

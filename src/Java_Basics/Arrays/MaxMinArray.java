package Java_Basics.Arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of the elements of array");
        int n = sc.nextInt();
        if(n==0) return;
        int[] arr = new int[n];
        for(int i=0; i< arr.length;i++){
            System.out.println("Enter the "+i+" element : ");
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int min=Integer.MAX_VALUE;
        for(int a:arr){
            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }
        }
        System.out.println("Max element is : "+max+" Min elemenet is  "+min);
    }
}

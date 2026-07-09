package Java_Basics.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of the elements of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length;i++){
            System.out.println("Enter the "+i+" element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The reversed array element are: ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

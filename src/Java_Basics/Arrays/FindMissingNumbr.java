package Java_Basics.Arrays;

import java.util.Scanner;

public class FindMissingNumbr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of the elements of array");
        int n = sc.nextInt();
        if(n==0) return;
        int[] arr = new int[n];
        for(int i=0; i< arr.length;i++){
            System.out.println("Enter the "+i+" element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i< arr.length-1;i++){
            if(arr[i+1]==((arr[i])+1)){
               continue;
            }
            else {
                System.out.println("The missing no. is: "+((arr[i])+1));
            }
        }


    }
}

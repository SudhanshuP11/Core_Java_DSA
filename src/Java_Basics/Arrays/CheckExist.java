package Java_Basics.Arrays;

import java.util.Scanner;

public class CheckExist {
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
        sc.nextLine();
        System.out.println("Enter the no. to check the existence: ");
        int target = Integer.parseInt(sc.nextLine());
        int a =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                a = i;
                break;
            }
        }
        System.out.println("the existed value at index: "+a);
    }
}

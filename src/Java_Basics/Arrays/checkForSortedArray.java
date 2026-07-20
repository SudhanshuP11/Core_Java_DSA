package Java_Basics.Arrays;

import java.util.Scanner;

class CheckForSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of the elements of array");
        int n = sc.nextInt();

        // Arrays with 0 or 1 element are technically already sorted
        if(n == 0 || n == 1) {
            System.out.println("True sorted");
            return;
        }

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the " + i + " element : ");
            arr[i] = sc.nextInt();
        }

        boolean b = true;

        // Stop at length - 1 so arr[i+1] doesn't go out of bounds
        for (int i = 0; i < arr.length - 1; i++){
            // If current element is greater than or equal to the next, it's not strictly sorted
            if(arr[i] >= arr[i+1]){
                b = false;
                break;
            }
        }

        if(b){
            System.out.println("True sorted");
        } else {
            System.out.println("False not sorted");
        }
    }
}
package Java_Basics.If_Else_If_Ladder;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int number = sc.nextInt();
        if(number%2==0) System.out.println("Given number is Even");
        else System.out.println("Given number is odd");
    }
}

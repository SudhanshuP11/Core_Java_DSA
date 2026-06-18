package Java_Basics.If_Else_If_Ladder;

import java.util.Scanner;

public class GreaterOfTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>b) System.out.println("First number is greater");
        else System.out.println("Second number is greater");
    }
}

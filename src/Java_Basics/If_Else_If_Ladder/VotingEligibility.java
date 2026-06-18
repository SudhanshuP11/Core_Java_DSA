package Java_Basics.If_Else_If_Ladder;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age>=18) System.out.println("Eligible");
        else System.out.println("Not Eligible");
    }
}

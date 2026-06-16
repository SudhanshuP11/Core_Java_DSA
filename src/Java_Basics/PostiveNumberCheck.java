package Java_Basics;

import java.util.Scanner;

public class PostiveNumberCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int number = sc.nextInt();
        if(number>0) System.out.println("Given Number "+number+" is a Postive Number");
        else if(number==0) System.out.println("Number is zero");
        else System.out.println("Given Number "+number+" is a negative number");
    }
}

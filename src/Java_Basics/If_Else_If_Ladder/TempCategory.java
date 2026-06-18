package Java_Basics.If_Else_If_Ladder;

import java.util.Scanner;

public class TempCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp: ");
        int temp = sc.nextInt();
        if(temp>=10&temp<25){
            System.out.println("Moderate");
        }
        else if(temp<10) System.out.println("Very cold");
        else System.out.println("Hot");
    }
}

package Java_Basics.Switch;

import java.util.Scanner;

public class SimplCalc {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op){
            case '+': System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b);break;
            case '/': System.out.println(a/b);break;
            default: System.out.println("Invalid operation");break;
        }
    }
}

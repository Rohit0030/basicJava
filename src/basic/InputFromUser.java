package basic;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a= sr.nextInt();
        System.out.println("Enter the Second number ");
        int b= sr.nextInt();
        int sum = a+b;
        System.out.println("Result = "+sum);
    }
}
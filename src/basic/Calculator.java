package basic;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        char operator;
        double num1,num2,result;
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter the first number ");
        num1 = sr.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = sr.next().charAt(0);

        System.out.println("Enter the second number ");
        num2 =sr.nextDouble();

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println(num1 +" + "+num2 +" = "+result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 +" - "+num2 +" = "+result);
                break;

            case '*':
            result = num1 - num2;
                System.out.println(num1+ " * "+num2+" = "+result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1+ " / "+num2+" = "+result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        sr.close();

    }
}

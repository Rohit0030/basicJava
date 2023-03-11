package conditional_statement;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {

        Scanner sr= new Scanner(System.in);
        System.out.println("Enter your Age for voting");
        int age = sr.nextInt();
        if(age>=18){
            System.out.println("Person is Eligible for vote");
        }
        else {
            System.out.println("Person is not Eligible for vote");
        }

    }
}

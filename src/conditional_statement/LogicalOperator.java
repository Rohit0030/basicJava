package conditional_statement;
import java.util.Objects;
import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("First Enter your age ");
        int age = sr.nextInt();
        System.out.println("Enter your country ");
        String city = sr.next();
        //AND OPERATOR (&&)
        if (age >=18 && Objects.equals(city, "Agra")){
            System.out.println("age is "+age + " and city is "+city +" The person is Eligible for voting");
        }
        else {
            System.out.println("may be age less then 18 or city is not agra");
        }

        // OR operator (||)
        //NOT operator (!)
    }

}

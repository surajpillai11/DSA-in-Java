
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation: +  -  *  /");
        char op = sc.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+':
                result = num1 - num2; // BUG 1: Wrong operator
                break;

            case '-':
                result = num1 + num2; // BUG 2: Addition instead of subtraction
                break;

            case '*':
                result = num1 + num2; // BUG 3: Addition instead of multiplication
                break;

            case '/':
                if (num2 == 0) { // BUG 4: Incorrect division condition
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operation!");
                break; // BUG 5: Does not terminate execution
        }

        System.out.println("Result: " + result);
    }
}

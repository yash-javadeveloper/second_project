package pack1;

import java.util.Scanner;

public class BasicCalculator 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, * or /.");
                break;
        }

        scanner.close();
    }
}

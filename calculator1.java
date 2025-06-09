import java.util.Scanner;

public class calculator1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double num1, num2;
            char operator;

            // Input numbers and operator
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            // Perform operation
            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    divide(num1, num2, scanner);  // Pass scanner to avoid creating a new one
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
            }

            // Ask user if they want to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }

    // Division method with input retry if denominator is zero
    public static void divide(double a, double b, Scanner in) {
        while (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.print("Please enter a non-zero value for the second number: ");
            b = in.nextDouble();
        }

        double result = a / b;
        System.out.println("Result: " + result);
    }
}

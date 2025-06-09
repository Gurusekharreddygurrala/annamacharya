import java.util.Scanner;

public class advancecalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.print("How many calculations do you want to perform? ");
        int n = scanner.nextInt();

        double[] num1 = new double[n];
        double[] num2 = new double[n];
        char[] operators = new char[n];

        // Input all values
        for (int i = 0; i < n; i++) {
            System.out.printf("Calculation %d:\n", i + 1);
            System.out.print("Enter first number: ");
            num1[i] = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2[i] = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operators[i] = scanner.next().charAt(0);
        }

        // Perform calculations
        for (int i = 0; i < n; i++) {
            System.out.printf("Result of calculation %d: ", i + 1);
            switch (operators[i]) {
                case '+':
                result=num1[i]+num2[i];
                    System.out.println(result);
                    
                    break;
                case '-':
                    System.out.println(num1[i] - num2[i]);
                    break;
                case '*':
                    System.out.println(num1[i] * num2[i]);
                    break;
                case '/':
                    divide(num1[i], num2[i], scanner);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }

        scanner.close();
        System.out.println("All calculations done.");
    }

    // Division method with retry if denominator is zero
    public static void divide(double a, double b, Scanner scanner) {
        while (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.print("Please enter a non-zero value for the second number: ");
            b = scanner.nextDouble();
        }
        System.out.println(a / b);
    }
}

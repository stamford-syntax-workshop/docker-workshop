import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt for first number
            System.out.print("Enter your first number: ");
            int num1 = sc.nextInt();

            // Prompt for second number
            System.out.print("Enter your second number: ");
            int num2 = sc.nextInt();

            // Prompt for operation
            System.out.println("Choose the operation (1 - 4):");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int operation = sc.nextInt();

            int result = 0;
             switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        double divisionResult = (double) num1 / num2;
                        System.out.println("Result: " + divisionResult);
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please choose a number between 1 and 4.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}

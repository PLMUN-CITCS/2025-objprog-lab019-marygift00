import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                } else {
                    break; // Valid input
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();
        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Main program flow
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

import java.util.Scanner;

public class SquareRootWithoutSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
        } else {
            double result = findSquareRoot(number);
            System.out.println("Square root of " + number + " is approximately: " + result);
        }

        scanner.close();
    }

    public static double findSquareRoot(double x) {
        // Initial guess
        double guess = x / 2.0;

        // Iterate to improve the guess using Newton-Raphson method
        for (int i = 0; i < 10; i++) {
            guess = 0.5 * (guess + x / guess);
        }

        return guess;
    }
}

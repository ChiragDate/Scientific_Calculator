import java.util.Scanner;

public class Calculator {
    public static double squareRoot(double x) {
        if (x < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Logarithm is only defined for positive numbers.");
        return Math.log(x);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("Result: " + squareRoot(sqrtInput));
                    break;
                case 2:
                    System.out.print("Enter integer: ");
                    int factInput = scanner.nextInt();
                    System.out.println("Result: " + factorial(factInput));
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    double logInput = scanner.nextDouble();
                    System.out.println("Result: " + naturalLog(logInput));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + power(base, exponent));
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}


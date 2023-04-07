public class BasicCalculator implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();

        System.out.println("Welcome to the Basic Calculator App!");
        System.out.println("Please enter the first number:");
        double a = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double b = scanner.nextDouble();

        System.out.println("Please select the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = calculator.add(a, b);
                break;
            case 2:
                result = calculator.subtract(a, b);
                break;
            case 3:
                result = calculator.multiply(a, b);
                break;
            case 4:
                try {
                    result = calculator.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}

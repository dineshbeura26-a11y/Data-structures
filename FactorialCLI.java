public class FactorialCLI {
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java FactorialCLI <number>");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
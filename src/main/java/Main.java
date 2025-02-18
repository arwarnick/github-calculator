import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");

        while (true) {
            System.out.println("Enter a command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            try {
                switch (parts[0].toLowerCase()) {
                    case "add":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.add(a, b));
                        }
                        break;

                    case "subtract":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.subtract(a, b));
                        }
                        break;

                    case "multiply":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.multiply(a, b));
                        }
                        break;

                    case "divide":
                        if (parts.length == 3) {
                            int a = Integer.parseInt(parts[1]);
                            int b = Integer.parseInt(parts[2]);
                            System.out.println(calculator.divide(a, b));
                        }
                        break;

                    case "fibonacci":
                        if (parts.length == 2) {
                            int n = Integer.parseInt(parts[1]);
                            System.out.println(calculator.fibonacciNumberFinder(n));
                        }
                        break;

                    case "binary":
                        if (parts.length == 2) {
                            int n = Integer.parseInt(parts[1]);
                            System.out.println(calculator.intToBinaryNumber(n));
                        }
                        break;

                    default:
                        System.out.println("Invalid command");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Insufficient arguments");
            }
        }
    }
}
package Assignment1;

public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <num1> <operator> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        String op = args[1];
        double num2 = Double.parseDouble(args[2]);

        switch (op) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error: Division by zero!");
                else
                    System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator. Use +, -, *, /");
        }
    }
}



import java.util.*;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double memory = 0;
        double lastResult = 0;
        Stack<Double> history = new Stack<>();

        System.out.println("Welcome to the Improved Java Calculator");
        System.out.println("Type 'exit' to quit, 'undo' to undo last result, 'history' to see past results.\n");
        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine().trim();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) break;

            // Memory recall
            if (input.equalsIgnoreCase("MR")) {
                System.out.println(" Memory: " + memory);
                continue;
            }

            // Show history
            if (input.equalsIgnoreCase("history")) {
                System.out.println(" History:");
                for (Double h : history) {
                    System.out.println("= " + h);
                }
                continue;
            }

            // Undo last result
            if (input.equalsIgnoreCase("undo")) {
                if (!history.isEmpty()) {
                    history.pop();
                    lastResult = history.isEmpty() ? 0 : history.peek();
                    System.out.println("Undone. New result: " + lastResult);
                } else {
                    System.out.println("No history to undo.");
                }
                continue;
            }

            try {
                input = input.replaceAll("([+\\-*/%^()])", " $1 "); 
                input = input.replaceAll("\\s+", " ").trim();  

                String[] parts = input.split(" ");
                String command = parts[0].toUpperCase();

                double result = 0;

                
                switch (command) {
                    case "SQRT":
                        result = Math.sqrt(Double.parseDouble(parts[1]));
                        break;
                    case "ABS":
                        result = Math.abs(Double.parseDouble(parts[1]));
                        break;
                    case "LOG":
                        result = Math.log(Double.parseDouble(parts[1]));
                        break;
                    case "SIN":
                        result = Math.sin(Double.parseDouble(parts[1]));
                        break;
                    case "COS":
                        result = Math.cos(Double.parseDouble(parts[1]));
                        break;
                    case "TAN":
                        result = Math.tan(Double.parseDouble(parts[1]));
                        break;
                    case "POW":
                        result = Math.pow(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "M+":
                        memory += parts.length == 1 ? lastResult : Double.parseDouble(parts[1]);
                        System.out.println("Added to memory.");
                        continue;
                    case "M-":
                        memory -= parts.length == 1 ? lastResult : Double.parseDouble(parts[1]);
                        System.out.println("Subtracted from memory.");
                        continue;
                    default:
                        
                        if (parts.length < 3) throw new IllegalArgumentException("Invalid input format. Use a + b");

                        double a = Double.parseDouble(parts[0]);
                        String op = parts[1];
                        double b = Double.parseDouble(parts[2]);

                        switch (op) {
                            case "+": result = a + b; break;
                            case "-": result = a - b; break;
                            case "*": result = a * b; break;
                            case "/":
                                if (b == 0) throw new ArithmeticException("❌ Cannot divide by zero.");
                                result = a / b;
                                break;
                            case "%": result = a % b; break;
                            case "^": result = Math.pow(a, b); break;
                            default: throw new IllegalArgumentException("❌ Unsupported operator: " + op);
                        }
                }

                lastResult = result;
                history.push(result);
                System.out.println("= " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println(" Exiting Calculator. Come back anytime!");
    }
}

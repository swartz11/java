import java.util.*;

public class AdvancedCalculator {

    // Operator precedence
    private static int precedence(String op) {
        return switch (op) {
            case "+", "-" -> 1;
            case "*", "/", "%" -> 2;
            case "^" -> 3;
            default -> -1;
        };
    }

    // Infix to Postfix using Shunting Yard
    private static List<String> infixToPostfix(String expression) {
        List<String> postfix = new ArrayList<>();
        Stack<String> operators = new Stack<>();
        String[] tokens = expression.replaceAll("([+\\-*/%^()])", " $1 ")
                                    .trim()
                                    .split("\\s+");

        for (String token : tokens) {
            if (token.matches("\\d+(\\.\\d+)?")) {
                postfix.add(token);
            } else if (token.equals("(")) {
                operators.push(token);
            } else if (token.equals(")")) {
                while (!operators.peek().equals("(")) {
                    postfix.add(operators.pop());
                }
                operators.pop(); 
            } else {
                while (!operators.isEmpty() &&
                        precedence(token) <= precedence(operators.peek())) {
                    postfix.add(operators.pop());
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            postfix.add(operators.pop());
        }

        return postfix;
    }

    // Evaluate postfix expression
    private static double evaluatePostfix(List<String> postfix) {
        Stack<Double> stack = new Stack<>();

        for (String token : postfix) {
            if (token.matches("\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                    case "%" -> stack.push(a % b);
                    case "^" -> stack.push(Math.pow(a, b));
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double memory = 0;
        double lastResult = 0;
        Stack<Double> history = new Stack<>();

        System.out.println("Welcome to the Advanced Calculator");
        System.out.println("Commands: exit | undo | history | MR | M+ | M- | sqrt 9 | pow 2 3\n");

        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) break;

            if (input.equalsIgnoreCase("MR")) {
                System.out.println(" Memory: " + memory);
                continue;
            }

            if (input.equalsIgnoreCase("M+")) {
                memory += lastResult;
                System.out.println("Added last result (" + lastResult + ") to memory.");
                continue;
            }

            if (input.equalsIgnoreCase("M-")) {
                memory -= lastResult;
                System.out.println("Subtracted last result (" + lastResult + ") from memory.");
                continue;
            }

            if (input.equalsIgnoreCase("history")) {
                System.out.println(" History:");
                for (Double h : history) {
                    System.out.println("= " + h);
                }
                continue;
            }

            if (input.equalsIgnoreCase("undo")) {
                if (!history.isEmpty()) {
                    history.pop();
                    lastResult = history.isEmpty() ? 0 : history.peek();
                    System.out.println(" Undone. New result: " + lastResult);
                } else {
                    System.out.println(" No history to undo.");
                }
                continue;
            }

            try {
                input = input.replaceAll("([+\\-*/%^()])", " $1 ");
                input = input.replaceAll("\\s+", " ").trim();

                String[] parts = input.split(" ");
                String command = parts[0].toUpperCase();
                double result;

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
                    default:
                        List<String> postfix = infixToPostfix(input);
                        result = evaluatePostfix(postfix);
                }

                lastResult = result;
                history.push(result);
                System.out.println("= " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Exiting Calculator. Come back anytime!");
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Question2 {

    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") &&
                !token.equals("*") && !token.equals("/")) {

                stack.push(Integer.valueOf(token));

            } else {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            }
        }

        int result = stack.pop();
        return result;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan RPN expression dengan spasi:");
            String input = scanner.nextLine();

            String[] tokens = input.split(" ");

            int result = evaluate_rpn(tokens);

            System.out.println("Hasil akhir: " + result);

            scanner.close();
        }
    }
}

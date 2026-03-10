import java.util.Scanner;
import java.util.Stack;

public class Question1 {

    public static boolean is_balanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bracket: ");
            String s = input.nextLine();

            boolean result = is_balanced(s);

            if (result) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }

            input.close();
        }
    }
}

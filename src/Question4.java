
import java.util.*;

public class Question4 {

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }

            tempStack.push(current);
        }

        return tempStack;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> stack = new Stack<>();

            System.out.print("\n Masukkan angka dengan spasi: ");

            String line = sc.nextLine();
            String[] numbers = line.split(" ");

            for (String num : numbers) {
                stack.push(Integer.valueOf(num));
            }

            Stack<Integer> sortedStack = sortStack(stack);

            List<Integer> result = new ArrayList<>();
            while (!sortedStack.isEmpty()) {
                result.add(sortedStack.pop());
            }

            Collections.reverse(result);

            for (int n : result) {
                System.out.print(n + " ");
            }
        } catch (NumberFormatException e) {

        }
    }
}



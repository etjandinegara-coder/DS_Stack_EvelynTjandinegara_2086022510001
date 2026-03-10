import java.util.Scanner;
import java.util.Stack;

public class Question5 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> stack = new Stack<>();

            System.out.print("Masukkan nilai momentum: ");
            int n = sc.nextInt();

            while (n >= 1) {
                stack.push(n);
                n = n / 2;
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }

            sc.close();
        }
    }
}

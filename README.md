Question 1 — Bracket Checker 
Implement is_balanced(s) to check whether brackets are balanced using a stack.
= 'public static boolean is_balanced(String s)'
= 'boolean result = is_balanced(s)'


Question 2 — Reverse Polish Notation Evaluation
Implement evaluate_rpn(tokens) using a stack to evaluate postfix expressions.
= 'public static int evaluate_rpn(String[] tokens)'
= 'int result = evaluate_rpn(tokens)'


Question 3 — Chrono Stack Engine (Stack Instruction Reconstruction)
Create a program that outputs the required instruction sequence based on the described temporal stack rules.
= while (target > 1) {
            if (target % 2 == 0) {
                target /= 2;
                s.push("d+");
            } else {
                target--;
                s.push("1+");
            }
        }
= Dengan ini program akan menghasilkan instruksi dan menyimpannya ke stack sementara.


Question 4 — Cheat Buster Security System (Stack-Based Ordering)
Implement the process to generate the final ordered output using the described stack injection mechanism.
= Jadi dalam keadaan ini, program menggunakan dua stack yaitu stack sementara dan stack utama. 'Stack<Integer> tempStack = new Stack<>()' dan 'Stack<Integer> stack = new Stack<>()'. Melalui mekanisme injection ini, program dapat mengeluarkan output yang terurut hanya dengan menggunakan push, pop dan peek.


Question 5 — Operation Chastise (Stack-Based Counting)
Calculate when the bombs are to be dropped, to which you need to create a formula for it. Assuming the craft's n velocity directly translates to momentum upon drop, calculate the momentum from each of the bounce
= try (Scanner sc = new Scanner(System.in)) {
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

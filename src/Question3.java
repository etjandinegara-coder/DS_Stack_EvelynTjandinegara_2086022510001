import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
         Solution sol = new Solution();

           int n = sc.nextInt();
           Stack<Integer> timeline = new Stack<>();

           for (int i = 0; i < n; i++) {
               timeline.push(sc.nextInt());
           }

           StringBuilder hasil = new StringBuilder();
           int distorsi = 0;

           while (!timeline.isEmpty()) {
               int target = timeline.pop() + distorsi;

               String rute = sol.build(target);

               int plus = 0;
               for (char c : rute.toCharArray()) {
                   if (c == '+') plus++;
               }

               distorsi += plus;
               hasil.insert(0, rute);
           }

           System.out.println(hasil);
        }
    }
}

class Solution {

    public String build(int target) {

        Stack<String> s = new Stack<>();

        while (target > 1) {
            if (target % 2 == 0) {
                target /= 2;
                s.push("d+");
            } else {
                target--;
                s.push("1+");
            }
        }

        StringBuilder res = new StringBuilder("1");

        while (!s.isEmpty()) {
            res.append(s.pop());
        }

        return res.toString();
    }
}

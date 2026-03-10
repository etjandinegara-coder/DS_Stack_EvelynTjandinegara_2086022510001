Question 1 — Bracket Checker 
Implement is_balanced(s) to check whether brackets are balanced using a stack.
=   'public static boolean is_balanced(String s)'
    'boolean result = is_balanced(s)'

= Program ini menggunakan stack untuk menyimpan opening brackets. Ketika closing brackets muncul, program akan memeriksa    apakah bagian atas stack cocok dengan closing brackets yang muncul.

= Input '{([])}' ; Outputnya 'Balanced'

= Kasus lainnya ketika kosong maka outputnya akan Balanced, kalau hanya opening atau closing brackets saja maka akan keluar output Not balanced


Question 2 — Reverse Polish Notation Evaluation
Implement evaluate_rpn(tokens) using a stack to evaluate postfix expressions.
=   'public static int evaluate_rpn(String[] tokens)'
    'int result = evaluate_rpn(tokens)'

= Program ini mengevaluasi Reverse Polish Notation Evaluation menggunakan stack. Angka di push ke dalam stack, dan operator mengeluarkan dua angka teratas dengan pop untuk melakukan perhitungan.

= Input '2 1 + 3 *' ; Outputnya 'Hasil akhir: 9'


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

= Algoritma bekerja dari belakang ke depan. Jika jumlahnya genap maka bagi dengan 2 dan tekan "d+". Jika angkanya ganjil maka kurangi 1 dan tekan "1+". Instruksi ini disimpan dalam stack sehingga dapat dieksekusi dalam urutan yang benar nanti.

Question 4 — Cheat Buster Security System (Stack-Based Ordering)
Implement the process to generate the final ordered output using the described stack injection mechanism.
= Jadi dalam keadaan ini, program menggunakan dua stack yaitu stack sementara dan stack utama. 'Stack<Integer> tempStack = new Stack<>()' dan 'Stack<Integer> stack = new Stack<>()'. Melalui mekanisme injection ini, program dapat mengeluarkan output yang terurut hanya dengan menggunakan push, pop dan peek.

= Proses elemen di pop dari stack utama kemudian bandingkan dengan elemen dalam stack sementara lalu pindahkan elemen kembali jika perlu. Masukkan elemen di posisi yang benar, hal ini menghasilkan urutan yang diurutkan.


Question 5 — Operation Chastise (Stack-Based Counting)
Calculate when the bombs are to be dropped, to which you need to create a formula for it. Assuming the craft's n velocity directly translates to momentum upon drop, calculate the momentum from each of the bounce
= while (n >= 1) {
    stack.push(n);
    n = n / 2;
    }

= Input '10' ; Outputnya '1 2 5 10'

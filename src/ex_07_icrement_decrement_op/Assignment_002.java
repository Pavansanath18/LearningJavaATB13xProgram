package ex_07_icrement_decrement_op;

public class Assignment_002 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);

        // a = i++ | Exp = 1 | i = 2
        // +
        // b = ++i | Exp = 3 | i = 3
        // a + b = (i++ + ++i) = 1 + 3 = 4
    }
}

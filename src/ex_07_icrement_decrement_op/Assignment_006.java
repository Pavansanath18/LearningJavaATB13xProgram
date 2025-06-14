package ex_07_icrement_decrement_op;

public class Assignment_006 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);

        // x = 9
        // y = 5 + 7 + 7 + 9 = 28
    }
}

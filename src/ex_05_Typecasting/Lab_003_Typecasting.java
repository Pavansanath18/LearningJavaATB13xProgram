package ex_05_Typecasting;

public class Lab_003_Typecasting {
    public static void main(String[] args) {
        long phone = 9876543210l;
//        short s = phone; // Implicit Narrow?
        short s1 = (short)phone; // Explicit Narrow?
    }
}

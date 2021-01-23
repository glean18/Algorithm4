package chapter1_1;

public class EX05 {
    private static void isXYsmallOne(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        isXYsmallOne(0.1, 0.9999999999999999);
    }
}

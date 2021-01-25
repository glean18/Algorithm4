package chapter1_1;

/**
 * 计算 ln(N!)的值
 */
public class EX20 {
    private static double ln(int N) {
        if (N == 0) {
            return 0;
        } else {
            return Math.log(N) + ln(N - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}

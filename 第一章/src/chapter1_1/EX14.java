package chapter1_1;

/**
 * 编写一个静态方法：接受N，返回不大于logN（2为底）的最大整数
 */
public class EX14 {
    private static int lg(int N) {
        // 可以被2除多少回;
        int res = 0;
        while(N > 1) { // 不能小于1
            res++;
//            N /= 2;
            N >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(lg(1));
    }
}

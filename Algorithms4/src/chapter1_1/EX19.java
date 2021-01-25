package chapter1_1;

public class EX19 {
    /**
     * Fibonacci 数列
     * 递归的计算会很耗费时间 空间
     * @param N
     * @return
     */
    private static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }
    /**
     * 把计算过的值存储下来会快很多
     * @param N
     * @return
     */
    private static long[] F2(int N){
        long[] res = new long[N + 1];
        res[0] = 0;
        if (N == 0) return res;
        res[1] = 1;
        for (int i = 2; i <= N; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }
    public static void main(String[] args) {
/*        for (int i = 0; i < 100; i++) {
            System.out.println(i + " : " + F(i));
        }*/

        long[] res = F2(100);
        for (int i = 0; i < 100; i++) {
            if ((i > 0) && (Long.MAX_VALUE - res[i] < res[i - 1])) {
                System.out.println(i);
                break;
            }
            System.out.println(res[i]);
        }
    }
}

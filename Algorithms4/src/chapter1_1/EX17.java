package chapter1_1;

public class EX17 {
    /**
     * 请说明下列递归函数的问题：
     * 永远不会访问到基本情况，函数会一直运行直到溢出
     * @param n
     * @return
     */
    private static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }

    public static void main(String[] args) {
        System.out.println(exR2(3));
    }
}

package chapter1_1;

/**
 * 欧几里得算法 求解两个正整数 最大公约数
 * 不停的用 除数除以余数，余数为0时，最大公约数为当前算数的除数
 */
public class EX24 {
    /**
     * 欧几里得算法
     * @param p 被除数
     * @param q 除数
     * @return 最大公约数
     */
    private static int euclid(int p, int q) {
        System.out.printf("p: %d, q: %d", p, q);
        System.out.println();
        // 先保证p > q
        if(p < q) {
            int t = p;
            p = q;
            q = t;
        }
        int s = p % q;
        if (s == 0) return q;
        else return euclid(q, s);
    }

    public static void main(String[] args) {
//        System.out.println(euclid(105,24));
//        System.out.println(euclid(1111111, 1234567));
        String s1 = "test";
        String s2 = "test123";
        String s3 = "tast";
        System.out.println(s1.compareTo(s2));  // -3
        System.out.println(s2.compareTo(s1));  // 3
        System.out.println(s1.compareTo(s3));  // 4
        System.out.println(s3.compareTo(s1));  // -4
    }
}

package chapter1_2;

public class EX07 {
    /**
     * 这个递归函数得到的是自己
     * @param s
     * @return
     */
    private static String mystery(String s) {
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);
        return mystery(a) + mystery(b);
    }
    public static void main(String[] args) {
        System.out.println(mystery("1234567"));
    }
}

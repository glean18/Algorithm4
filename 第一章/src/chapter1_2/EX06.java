package chapter1_2;

/**
 * 判断两个字符串是否为回环变位
 * eg: ABCD 和 CDAB
 */
public class EX06 {
    private static boolean isCircular(String s1, String s2) {
        if (s1.length() == s2.length() && s1.concat(s1).indexOf(s2) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcdf";
        if (isCircular(s1, s2)) {
            System.out.println("\"" + s1 + "\" is the circular rotation of \"" + s2 + "\"");
        } else {
            System.out.println("\"" + s1 + "\" is not the circular rotation of \"" + s2 + "\"");
        }
    }
}

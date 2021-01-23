package chapter1_2;

/**
 * 以下代码会打印出什么
 */
public class EX04 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        s1 = "world";
        System.out.println(s1); // world
        System.out.println(s2); // hello
    }
}

package chapter1_1;

public class EX09 {
    /**
     * 把一个正整数用二进制表示（String 形式）
     */
    private static String intToBinaryString(int n) {
        String s = "";
        while(n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }
        return s == "" ? "0" : s;
    }



    public static void main(String[] args) {
        System.out.println(intToBinaryString(2));
        System.out.println(Integer.toBinaryString(-2));
        for (int i = 0; i < 1000; i++) {
            int n = (int)(Math.random()*100);
            if (!Integer.toBinaryString(n).equals(intToBinaryString(n))) {
                System.out.println(i + " :error...");
                System.out.println("n:" + n);
                System.out.println("Integer自有方法：" + Integer.toBinaryString(n));
                System.out.println("myself:" + intToBinaryString(n));
                break;
            }
        }
        System.out.println("good job ~");
    }
}

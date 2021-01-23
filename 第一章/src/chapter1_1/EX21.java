package chapter1_1;

import java.util.Scanner;

public class EX21 {
    // 按照格式输出


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input cout:");
        int n = in.nextInt();
        String[] names = new String[n];
        int[] numbers1 = new int[n];
        int[] numbers2 = new int[n];
        for (int i = 0; i < n; i++) {
             names[i] = in.next();
             numbers1[i] = in.nextInt();
             numbers2[i] = in.nextInt();
        }
        System.out.println("按照格式输出如下：");
        for (int i = 0; i < n; i++) {
            System.out.printf("%8s|%4d|%4d|%6.3f", names[i], numbers1[i], numbers2[i], ((double)numbers1[i] / (double)numbers2[i]));
            System.out.println();
        }
    }
}

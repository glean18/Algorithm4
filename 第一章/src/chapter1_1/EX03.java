package chapter1_1;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        if (a[0] == a[1] && a[1] == a[2]) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

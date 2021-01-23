package chapter1_1;

import java.util.Arrays;

public class EX12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 -i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(a));
        /**
         * [0, 1, 2, 3, 4, 4, 3, 2, 1, 0]
         */
    }
}

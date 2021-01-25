package chapter1_1;

import java.util.Arrays;

public class EX15 {
    private static int[] histogram(int[] arr, int M) {
        if (arr == null) {
            return null;
        }
        int[]res = new int[M];
        for (int a : arr) {
            if (a >= M) {
                continue;
            }
            res[a]++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] test = {1,2,2,1,5};
        System.out.println(Arrays.toString( histogram(test,4)));
    }
}

package chapter1_2;

import java.util.Arrays;

/**
 * 交换两个百万级别的数组
 */
public class EX08 {
    private static void exchange(int[] a, int[] b) {
        int[] t = a;
        a = b;
        b = t;
    }
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {4, 3};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("函数交换后：");
        exchange(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        /**
         * 没有发生交换
         * [1, 2]
         * [4, 3]
         */
        int[] t = a;
        a = b;
        b = t;
        System.out.println("直接操作交换：");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        /**
         * 发生交换
         * [4, 3]
         * [1, 2]
         */
        Arrays.sort(a);
        System.out.println("排序：");
        System.out.println(Arrays.toString(a));
        /**
         * 发生排序，因为操作的是数组中的元素（基本类型）
         * [3, 4]
         */
    }
}

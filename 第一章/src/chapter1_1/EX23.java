package chapter1_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * arr: 现在是代表一个白名单
 * + ： 代表打印不在白名单上的值
 * - ： 代表打印在白名单上的值
 * key[] : 输入值的数组
 */
public class EX23 {
    private static int rank(int key, int[] arr) {
        return rank(key, arr, 0, arr.length - 1);
    }

    private static int rank(int key, int[] arr, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + ((hi - lo) >> 1);
        if (arr[mid] < key) return rank(key, arr, mid + 1, hi);
        else if (arr[mid] > key) return rank(key, arr, lo, mid - 1);
        else return mid;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
        Scanner in = new Scanner(System.in);
        System.out.println("+ or - ?");
        String arg = in.next();
        in.nextLine();
        String[] keys = in.nextLine().split(" ");
//        System.out.println(keys[0]);
//        System.out.println(Arrays.toString(keys));
        for(String key : keys) {
            if(rank(Integer.parseInt(key), a) == -1 && arg.equals("+")) {
                System.out.print(key + "  ");
            } else if (rank(Integer.parseInt(key), a) != -1 && arg.equals("-")) {
                System.out.print(key + "  ");
            }
        }
        System.out.println();
    }
}

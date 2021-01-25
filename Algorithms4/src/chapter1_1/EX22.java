package chapter1_1;

/**
 * 递归实现二分查找（BinarySearch）
 * 并且在递归函数调用时，打印出它的参数lo，li并且按照递归的深度缩进
 */
public class EX22 {
    private static int rank(int key, int[] arr) {
        return rank(key, arr, 0, arr.length - 1, 0);
    }

    private static int rank(int key, int[] arr, int lo, int hi, int deep) {
        int deepCopy = deep;
        while(--deepCopy >= 0) System.out.print("   ");
        System.out.printf("lo: %4d, hi: %4d", lo, hi);
        System.out.println();
        if (lo > hi) return -1;
        int mid = lo + ((hi - lo) >> 1);
        if (arr[mid] < key) return rank(key, arr, mid + 1, hi, deep + 1);
        else if (arr[mid] > key) return rank(key, arr, lo, mid - 1, deep + 1);
        else return mid;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
        int key = 5;
        int pos = rank(key, a);
        System.out.println(pos == -1 ? "not found" : "position: " + pos);
    }
}

package chapter1_1;

import java.util.Arrays;

/**
 * 数组转置
 */
public class EX13 {
    private static int[][] transpose(int[][] arr) {
        if (arr == null) {
            return null;
        }
        int row = arr.length;
        int column  = arr[0].length;
        int[][] res = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res[j][i] = arr[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
        System.out.println("------------");
        System.out.println(Arrays.deepToString(transpose(a)));

    }
}

package chapter1_1;

public class EX11 {
    private static void printTwoDimensionBooleanArray(boolean[][] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int row = arr.length;
        int column = arr[0].length;

        for (int i = -1; i < row; i++) {
            for (int j = -1; j < column; j++) {
                if (i == -1) {
                    // 打印第一行(列号)： 0 1 2 3 ...
                    if(j == -1) {
                        System.out.print("*/.\t");
                    } else {
                        System.out.print(j + "\t");
                    }
                } else {
                    if (j == -1) {
                        System.out.print(i + "\t");
                    } else {
/*                        if (arr[i][j]) {
                            System.out.print("*\t");
                        } else {
                            System.out.print(".\t");
                        }*/
                        System.out.print(arr[i][j] ? "*\t" : ".\t");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        boolean[][] arr = {{true,false,false,true,true,false},
                {true,true,false,false,true,true,},
                {true,false,false,true,true,false},};
        printTwoDimensionBooleanArray(arr);
    }
}

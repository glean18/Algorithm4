package chapter1_2;

import edu.princeton.cs.algs4.Interval1D;

import java.util.Scanner;

/**
 * 读取N个间隔，打印出所有相交对
 */
public class EX02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Interval1D[] interval1DS = new Interval1D[n];  // Interval1D：理解为线段
        for (int i = 0; i < n; i++) {
            interval1DS[i] = new Interval1D(in.nextDouble(), in.nextDouble());
        }
        if (n > 2) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (interval1DS[i].intersects(interval1DS[j])) {
                        System.out.println(interval1DS[i] + " intersects " + interval1DS[j]);
                    }
                }
            }
        }
    }
}

package chapter1_2;

import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * 没看懂这个题
 */

public class EX03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double min = in.nextDouble();
        double max = in.nextDouble();
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Point2D[] leftTopPoints = new Point2D[n];
        Point2D[] rightBottomPoints = new Point2D[n];
        Interval2D[] interval2DS = new Interval2D[n];
        for (int i = 0; i < n; i++) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);

        }
    }
}

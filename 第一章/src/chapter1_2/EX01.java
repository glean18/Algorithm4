package chapter1_2;


import edu.princeton.cs.algs4.Point2D;

import java.util.Scanner;

public class EX01 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }
        if (n > 1) {
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (points[i].distanceTo(points[j]) < min) {
                        min = points[i].distanceTo(points[j]);
                    }
                }
            }
            System.out.println("min: " + min);
        }
    }
}

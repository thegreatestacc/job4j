package ru.job4j.condition;

/**
 * @author Vladimir Solovev
 * @version 1.0
 * @since 0.1
 */

public class Point {
    private int x;
    private int y;

    /**
     * Constructor.
     */

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method distanceTo.
     * @return distance from the first point to the second point.
     */

    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Method main.
     */

    public static void main(String[] args) {
        Point a = new Point(5, 6);
        Point b = new Point(12, 25);

        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);

        System.out.println("Расстояние между точками А и В : " + result);
    }
}
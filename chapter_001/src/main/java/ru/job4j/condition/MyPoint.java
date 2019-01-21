package ru.job4j.condition;

/**
 * @author Vladimir Solovev
 * @version 1.0
 * @since 0.1
 */

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo (MyPoint that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        MyPoint a = new MyPoint(5,6);
        MyPoint b = new MyPoint(12,25);

        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);

        System.out.println("Расстояние между точками А и В : " + result);
    }
}
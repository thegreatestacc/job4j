package ru.job4j.calculator;

/**
 *Calculator
 *
 *@author solovev (sovliv@yandex.ru)
 *@since 21.01.2019
 *@version 1.0
 */
public class Calculator {

    /**
     * Contains result;
     */
    private double result;

    /**
     * Method add.
     * @param first and second.
     * @return first plus second.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method dif.
     * @param first and second.
     * @return first difference second.
     */
    public void dif(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div.
     * @param first and second.
     * @return first division second.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method mult.
     * @param first and second.
     * @return first multiplication second.
     */
    public void mult(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * @return result.
     */
    public double getResult() {
        return this.result;
    }
}

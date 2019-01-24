package ru.job4j.loop;

/**
 *Factorial
 *
 *Class Класс для расчета факториала.
 *@author solovev.
 *@since 25.01.2019.
 *@version 1.0.
 */

public class Factorial {

    /**
     * Method calc.
     * @param n входной параметр.
     * @return result.
     */

    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

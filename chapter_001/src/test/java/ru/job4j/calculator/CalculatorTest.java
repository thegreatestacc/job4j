package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author solovev (sovliv@yandex.ru)
 * @version 1.0
 * @since 21.01.2019
 */

public class CalculatorTest {

    /**
     * Test add.
     */

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test dif.
     */
    @Test
    public void whenAddFourDifThreeThenOne() {
        Calculator calc = new Calculator();
        calc.dif(4D, 3D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test div.
     */
    @Test
    public void whenAddFourDivTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test mult.
     */
    @Test
    public void whenAddTwoMultThreeThenSix() {
        Calculator calc = new Calculator();
        calc.mult(2D, 3D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
}
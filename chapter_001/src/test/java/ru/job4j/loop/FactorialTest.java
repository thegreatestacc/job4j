package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author solovev (sovliv@yandex.ru)
 * @version 1.0
 * @since 25.01.2019
 */

public class FactorialTest {

    /**
     * Test whenCalculateFactorialForFiveThenOneHundredTwenty.
     */

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Test whenCalculateFactorialForZeroThenOne.
     */

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}

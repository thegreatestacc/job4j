package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author solovev (sovliv@yandex.ru)
 * @version 1.0
 * @since 16.01.2019
 */

public class CalculateTest {

    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Vladimir Solovev";
        String expect = "Echo, echo, echo : Vladimir Solovev";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }
}
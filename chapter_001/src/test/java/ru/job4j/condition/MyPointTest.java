package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author solovev (sovliv@yandex.ru)
 * @version 1.0
 * @since 22.01.2019
 */

public class MyPointTest {

    /**
     * Test distanceTo method.
     */

    @Test
    public void distanceFromTheFirstPointToTheSecond() {
        MyPoint myPoint1 = new MyPoint(5, 6);
        MyPoint myPoint2 = new MyPoint(12, 25);
        double result = myPoint1.distanceTo(myPoint2);
        assertThat(result, closeTo(20, 0.3));
    }
}

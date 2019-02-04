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

public class PointTest {

    /**
     * Test distanceTo method.
     */

    @Test
    public void distanceFromTheFirstPointToTheSecond() {
        Point point1 = new Point(5, 6);
        Point point2 = new Point(12, 25);
        double result = point1.distanceTo(point2);
        assertThat(result, closeTo(20, 0.3));
    }
}

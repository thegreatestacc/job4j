package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max max = new Max();
        int result = max.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondLessFirst() {
        Max max = new Max();
        int result = max.max(3, 2);
        assertThat(result, is(3));
    }
}

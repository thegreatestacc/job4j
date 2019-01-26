package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenWrongDecision() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {4, 8, 2, 1, 0};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength1Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 5, 1, 6, 10};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
}

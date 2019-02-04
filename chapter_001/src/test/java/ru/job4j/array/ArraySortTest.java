package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraySortTest {
    @Test
    public void whenArraySort() {
        ArraySort arraySort = new ArraySort();
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = arraySort.sort();
        assertThat(result, is(expect));
    }
}

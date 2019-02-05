package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraySortTest {

    @Test
    public void whenTwoSortedArraysAreSortedAndMerged() {
        ArraySort arraySort = new ArraySort();
        int[] input1 = {0, 2, 4, 6, 8};
        int[] input2 = {1, 3, 5, 7, 9};
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = arraySort.sort(input1, input2);
        assertThat(result, is(expect));
    }
}

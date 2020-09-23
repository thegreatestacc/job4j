package ru.job4j.list;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConverterList2Array list = new ConverterList2Array();
        int[][] result = list.toArray(List.of(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] except = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(except));
    }
}

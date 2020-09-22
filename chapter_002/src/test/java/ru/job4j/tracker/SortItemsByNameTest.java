package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortItemsByNameTest {

    private static Item item1 = new Item("Vivaldi", "some description", 123L);
    private static Item item2 = new Item("Mozart", "some description", 123L);
    private static Item item3 = new Item("Chaykovskiy", "some description", 123L);
    private static List<Item> list = Arrays.asList(item1, item2, item3);

    @Test
    public void whenFirstNameBeforeThanSecond () {
        List<Item> result = Arrays.asList(item3, item2, item1);
        list.sort(new SortItemsByName());
        assertThat(result, is(list));
    }

    @Test
    public void whenSecondNameBeforeThanFirst() {
        List<Item> result = Arrays.asList(item1, item2, item3);
        list.sort(new SortItemByNameReverse());
        assertThat(result, is(list));
    }
}

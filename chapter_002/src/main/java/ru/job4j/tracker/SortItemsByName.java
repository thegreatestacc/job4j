package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Класс для сортировки итемов по имени
 */
public class SortItemsByName implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

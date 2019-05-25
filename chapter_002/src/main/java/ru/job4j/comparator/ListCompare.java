package ru.job4j.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = left.length() > right.length() ? left.length() : right.length();
        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();
        int rst = 0;
        for (int i = 0; i < size; i++) {
            rst = Character.compare(charLeft[i], charRight[i]);
            if (rst != 0) {
                break;
            }
        }
        return rst;
    }
}


package ru.job4j.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        int size = left.length() > right.length() ? left.length() : right.length();
        int rst = 0;

        for (int i = 0; i < size - 1; i++) {
            rst = Character.compare(left.toCharArray()[i], right.toCharArray()[i]);
            if (rst != 0) {
                break;
            }
        }
        return rst != 0 ? rst : Integer.compare(left.length(), right.length());
    }
}


package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Lada");
        set.add("BMW");
        set.add("Toyota");

        for (String str : set) {
            System.out.println(str);
        }
    }
}

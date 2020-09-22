package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {
    private static List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, -1, -2, -3, -4, -5);

    public static void main(String[] args) {
        System.out.println(numbers());
    }

    public static List<Integer> numbers() {
        return integers.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
    }
}

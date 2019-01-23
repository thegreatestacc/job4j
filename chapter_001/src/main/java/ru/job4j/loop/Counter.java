package ru.job4j.loop;

public class Counter {
    int result = 0;

    public int add(int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if ((start % 2) == 0) {
                result += start;
            }
            start++;
        }
        return result;
    }
}
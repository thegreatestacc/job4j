package ru.job4j.loop;

public class Factorial {
    int result = 1;
    public int calc(int n) {
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public int calcZero(int n) {
        if (n == 0) {
         result = 1;
        }
        return result;
    }
}

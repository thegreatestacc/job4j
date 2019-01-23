package ru.job4j.max;

public class Max {

    int result;

    public int max(int first, int second) {
        result = first > second ? first : second;
        return result;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(this.max(first, second), third);
        return temp;
    }
}

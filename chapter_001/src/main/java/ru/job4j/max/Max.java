package ru.job4j.max;

public class Max {

    int result;

    public int max(int first, int second) {
       return result = first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = this.max(this.max(first, second), third);
        return temp;
    }
}

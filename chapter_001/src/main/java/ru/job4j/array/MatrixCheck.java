package ru.job4j.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] == data[i + 1][i + 1]) && (data[data.length - 1][data.length - 1] == data[data.length - 1 - i][data.length - 1 - i])) {
                result = true;
            }
        }
        return result;
    }
}

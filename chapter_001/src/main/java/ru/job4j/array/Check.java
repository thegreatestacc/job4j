package ru.job4j.array;

/**
 * Проверить массив.
 * @author solovev (sovliv@yandex.ru)
 * @since 28.01.2019
 */
public class Check {

    /**
     * Метод проверяет массив.
     * @param data входной массив.
     * @return проверенный массив.
     */

    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

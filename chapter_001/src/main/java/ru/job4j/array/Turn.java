package ru.job4j.array;

/**
 * Перевернуть массив.
 * @author solovev (sovliv@yandex.ru)
 * @since 26.01.2019
 */

public class Turn {

    /**
     * Метод переварачивает массив.
     * @param array входной массив.
     * @return перевернутый массив.
     */

    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}

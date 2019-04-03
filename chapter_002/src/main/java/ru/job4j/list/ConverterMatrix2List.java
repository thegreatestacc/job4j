package ru.job4j.list;

/* public List<Integer> toList (int[][] array) {} - в метод приходит двумерный массив целых чисел,
* необходимо пройтись по всем элементам массива и добавить их в List<Integer>.*/

import java.util.ArrayList;
import java.util.List;

public class ConverterMatrix2List {
    public List<Integer> toList(int array[][]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }
}

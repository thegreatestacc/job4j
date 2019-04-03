package ru.job4j.list;

import java.util.List;

public class ConverterList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        //expression to check the multiplicity of an array
        int cells = list.size() % rows == 0 ? list.size()/rows : list.size()/rows + 1;
        //index for checking each item
        int index = 0;
        int[][] array = new int[rows][cells];
        //expression to fill in the empty cells of the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                array[i][j] = index >= list.size() ? 0 : list.get(index++);
            }
        }
        return array;
    }
}

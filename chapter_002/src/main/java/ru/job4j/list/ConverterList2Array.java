package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConverterList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        //expression to check the multiplicity of an array
        int cells = list.size() % rows == 0 ? list.size() / rows : list.size() / rows + 1;

        //indexes for checking each item
        int row = 0;
        int cell = 0;
        int[][] array = new int[rows][cells];

        //expression to fill in the empty cells of the array
        for (int tmp : list) {
            array[row][cell] = tmp;
            if (cell < cells - 1) {
                cell++;
            } else {
                cell = 0;
                row++;
            }
        }
        return array;
    }
    public List<Integer> convert(List<int[]> list) {
        List<Integer> arrList = new ArrayList<>();
        for (int[] array : list) {
            for (int element : array) {
                arrList.add(element);
            }
        }
        return arrList;
    }
}
package ru.job4j.array;

public class ArraySort {

    public int[] sort(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0, k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (j < arr1.length && k < arr2.length) {
                if (arr2[k] < arr1[j]) {
                    arr3[i] = arr2[k];
                    k++;
                } else {
                    arr3[i] = arr1[j];
                    j++;
                }
            } else if (j < arr1.length) {
                arr3[i] = arr1[j];
                j++;
            } else {
                arr3[i] = arr2[k];
                k++;
            }
        }
        return arr3;
    }
}

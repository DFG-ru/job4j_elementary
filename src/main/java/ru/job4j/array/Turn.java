package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int length = array.length - 1;
        for (int i = 0; i < length - i; i++) {
            temp = array[i];
            array[i] = array[length - i];
            array[length - i] = temp;
        }
        return array;
    }
}
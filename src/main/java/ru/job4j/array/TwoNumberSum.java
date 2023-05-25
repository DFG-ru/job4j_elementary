package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            } else if (array[i] + array[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}
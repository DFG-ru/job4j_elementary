package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean target = data[0];
        for (boolean value : data) {
            if (value != target) {
                result = false;
                break;
            }
        }
        return result;
    }
}
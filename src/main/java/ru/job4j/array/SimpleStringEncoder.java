package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result.append(symbol).append(counter > 1 ? counter : "");
                counter = 1;
                symbol = input.charAt(i);
                continue;
            }
            counter++;
        }
        return result.append(symbol).append(counter > 1 ? counter : "").toString();
    }
}
package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float ruble = 150;
        float euro = Converter.rubleToEuro(ruble);
        float dollar = rubleToDollar(ruble);
        System.out.println(ruble + " rubles are " + euro + " euro.");
        System.out.println(ruble + " rubles are " + dollar + " dollar's.");
    }
}
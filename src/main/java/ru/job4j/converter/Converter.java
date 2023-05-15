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
        float in = 140;
        float exceptedEuro = 2;
        float exceptedDollar = 2.3333333f;
        float euro = rubleToEuro(in);
        float dollar = rubleToDollar(in);
        boolean passed = exceptedEuro == euro;
        System.out.println(in + " rubles are " + euro + " euro. Test result " + passed);
        passed = exceptedDollar == dollar;
        System.out.println(in + " rubles are " + dollar + " dollar's. Test result " + passed);
    }
}
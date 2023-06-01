package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 0);
        double expected = 2;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to52then1dot41() {
        Point start = new Point(4, 3);
        Point end = new Point(5, 2);
        double expected = 1.41;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when62to81then2dot23() {
        Point start = new Point(6, 2);
        Point end = new Point(8, 1);
        double expected = 2.23;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }
}
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

    @Test
    public void when776to419to1then6dot70() {
        Point start = new Point(7, 7, 6);
        Point end = new Point(4, 1, 9);
        double expected = 7.34;
        double out = start.distance3d(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when916to245to1then7dot61() {
        Point start = new Point(9, 1, 6);
        Point end = new Point(2, 4, 5);
        double expected = 7.68;
        double out = start.distance3d(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when355to691to1then5() {
        Point start = new Point(3, 5, 5);
        Point end = new Point(6, 9, 1);
        double expected = 6.40;
        double out = start.distance3d(end);
        Assert.assertEquals(expected, out, 0.01);
    }
}
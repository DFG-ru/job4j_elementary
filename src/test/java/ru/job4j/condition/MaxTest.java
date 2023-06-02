package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then2() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To5To3Then3() {
        int first = 1;
        int second = 5;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5To5Then3() {
        int first = 5;
        int second = 5;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To3To7To7Then7() {
        int first = 1;
        int second = 3;
        int third = 7;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2To5To8Then8() {
        int first = 4;
        int second = 2;
        int third = 5;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}
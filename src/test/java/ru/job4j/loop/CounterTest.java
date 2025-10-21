package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.math.X2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void sumNumsFrom0to5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumsFrom10to5Then0() {
        int start = 10;
        int finish = 5;
        int expected = 0;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumsFrom0to10Then0() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }
}
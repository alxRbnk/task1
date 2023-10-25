package com.rubnikovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AverageTest {

    @Test
    void methodPositive() {
        Average average = new Average();
        int[] array = {1, 2, 3, 4, 5};
        int actual = average.averageNumber(array);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}
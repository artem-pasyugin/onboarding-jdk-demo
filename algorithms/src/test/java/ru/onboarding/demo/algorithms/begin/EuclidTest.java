package ru.onboarding.demo.algorithms.begin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EuclidTest {

    private Euclid instance = new Euclid();

    @Test
    void test() {
        Assertions.assertEquals(1, instance.getValue(1, 1));
        Assertions.assertEquals(57, instance.getValue(2166, 6099));
    }
}

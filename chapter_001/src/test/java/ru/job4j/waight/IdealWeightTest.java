package ru.job4j.waight;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class IdealWeightTest {

    @Test
    public void manWeight() {
        IdealWeight idealWeight = new IdealWeight();
        double weight = idealWeight.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womanWeight() {
        IdealWeight idealWeight = new IdealWeight();
        double weight = idealWeight.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}
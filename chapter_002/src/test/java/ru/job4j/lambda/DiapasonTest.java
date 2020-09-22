package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {
    private static Diapason function = new Diapason();

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = function.diapason(1,4, x -> x * x * 2);
        List<Double> expected = Arrays.asList(2D, 8D, 18D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThanLogarithmicResults() {
        List<Double> result = function.diapason(2,5, Math::log);
        List<Double> expected = Arrays.asList(0.6931471805599453,1.0986122886681098,1.3862943611198906);
        assertThat(result, is(expected));
    }
}

package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibo_1() {
        List<Long> expected_res = Arrays.asList(0L);
        Fibonacci fibo = new Fibonacci();
        assertThat(fibo.getFibo(1L)).isEqualTo(expected_res);
    }

    @Test
    public void fibo_2() {
        List<Long> expected_res = Arrays.asList(0L, 1L);
        Fibonacci fibo = new Fibonacci();
        assertThat(fibo.getFibo(2L)).isEqualTo(expected_res);
    }
}

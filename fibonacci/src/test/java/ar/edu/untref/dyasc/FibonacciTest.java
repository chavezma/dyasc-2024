package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibo_1() {
        Fibonacci fibo = new Fibonacci();
        assertThat(fibo.getFibo(1L)).isEqualTo(0);
    }

    @Test
    public void fibo_2() {
        Fibonacci fibo = new Fibonacci();
        assertThat(fibo.getFibo(2L)).isEqualTo(1);
    }
}

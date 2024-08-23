package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;

public class MainTest {

    @Test
    public void testGenerateFibonacciSequence() {
        String result = Main.generateFibonacciSequence(BigInteger.valueOf(5));
        assertThat(result).isEqualTo("0 1 1 2 3");

        result = Main.generateFibonacciSequence(BigInteger.ONE);
        assertThat(result).isEqualTo("0");

        result = Main.generateFibonacciSequence(BigInteger.valueOf(2));
        assertThat(result).isEqualTo("0 1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateFibonacciSequence_withNegative() {
        Main.generateFibonacciSequence(BigInteger.valueOf(-1));
    }
}

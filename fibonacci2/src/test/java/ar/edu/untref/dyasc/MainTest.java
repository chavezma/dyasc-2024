package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;

public class MainTest {

    @Test
    public void testGenerateFibonacciSequenceHD() {
        String result = Main.generateFibonacciSequence(BigInteger.valueOf(5), true, true);
        assertThat(result).isEqualTo("0 1 1 2 3");

        result = Main.generateFibonacciSequence(BigInteger.ONE, true, true);
        assertThat(result).isEqualTo("0");

        result = Main.generateFibonacciSequence(BigInteger.valueOf(2), true, true);
        assertThat(result).isEqualTo("0 1");
    }

    @Test
    public void testGenerateFibonacciSequenceOrientationVD() {
        String result = Main.generateFibonacciSequence(BigInteger.valueOf(5), false, true);
        assertThat(result).isEqualTo("\n0\n1\n1\n2\n3");

        result = Main.generateFibonacciSequence(BigInteger.ONE, false, true);
        assertThat(result).isEqualTo("\n0");

        result = Main.generateFibonacciSequence(BigInteger.valueOf(2), false, true);
        assertThat(result).isEqualTo("\n0\n1");
    }

    @Test
    public void testGenerateFibonacciSequenceHI() {
        String result = Main.generateFibonacciSequence(BigInteger.valueOf(5), true, false);
        assertThat(result).isEqualTo("3 2 1 1 0");

        result = Main.generateFibonacciSequence(BigInteger.ONE, true, false);
        assertThat(result).isEqualTo("0");

        result = Main.generateFibonacciSequence(BigInteger.valueOf(2), true, false);
        assertThat(result).isEqualTo("1 0");
    }

    @Test
    public void testGenerateFibonacciSequenceOrientationVI() {
        String result = Main.generateFibonacciSequence(BigInteger.valueOf(5), false, false);
        assertThat(result).isEqualTo("\n3\n2\n1\n1\n0");

        result = Main.generateFibonacciSequence(BigInteger.ONE, false, false);
        assertThat(result).isEqualTo("\n0");

        result = Main.generateFibonacciSequence(BigInteger.valueOf(2), false, false);
        assertThat(result).isEqualTo("\n1\n0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateFibonacciSequence_withNegative() {
        Main.generateFibonacciSequence(BigInteger.valueOf(-1), true, true);
    }
}

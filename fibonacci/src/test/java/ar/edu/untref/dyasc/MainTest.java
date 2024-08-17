package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void testGenerateFibonacciSequence() {
        String result = null;
        
        result = Main.generateFibonacciSequence(1L);
        assertThat(result).isEqualTo("0");

        result = Main.generateFibonacciSequence(2L);
        assertThat(result).isEqualTo("0 1");

        result = Main.generateFibonacciSequence(5L);
        assertThat(result).isEqualTo("0 1 1 2 3");

        result = Main.generateFibonacciSequence(8L);
        assertThat(result).isEqualTo("0 1 1 2 3 5 8 13");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateFibonacciSequence_withNegative() {
        Main.generateFibonacciSequence(-1L);
    }
}

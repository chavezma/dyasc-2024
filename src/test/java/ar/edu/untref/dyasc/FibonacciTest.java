package ar.edu.untref.dyasc;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibo_1() {
        List<BigInteger> expected_res = Arrays.asList(BigInteger.ZERO);
        Fibonacci fibo = new Fibonacci();
        assertEquals(fibo.getFibo(BigInteger.ONE), expected_res);
    }

    @Test
    public void fibo_2() {
        List<BigInteger> expected_res = Arrays.asList(BigInteger.ZERO, BigInteger.ONE);
        Fibonacci fibo = new Fibonacci();
        assertEquals(fibo.getFibo(BigInteger.valueOf(2)), expected_res);
    }

    @Test
    public void fibo_300() {
        // https://r-knott.surrey.ac.uk/Fibonacci/fibtable.html
        BigInteger f300_expected = new BigInteger("137347080577163115432025771710279131845700275212767467264610201");
        Fibonacci fibo = new Fibonacci();

        BigInteger f300_actual = fibo.getFibo(BigInteger.valueOf(300)).get(299);

        System.out.println("f300_actual: " + f300_actual.toString());
        System.out.println("f300_expected: " + f300_expected.toString());
        assertEquals(f300_actual.compareTo(f300_expected), 0);
    }

    @Test
    public void fibo_1000() {
        // http://www.fullbooks.com/The-first-1001-Fibonacci-Numbers.html
        BigInteger f1000_expected = new BigInteger("26863810024485359386146727202142923967616609318986952340123175997617981700247881689338369654483356564191827856161443356312976673642210350324634850410377680367334151172899169723197082763985615764450078474174626");
        Fibonacci fibo = new Fibonacci();
        BigInteger f1000_actual = fibo.getFibo(BigInteger.valueOf(1000)).get(999);
        assertEquals(f1000_actual.compareTo(f1000_expected), 0);
    }
}

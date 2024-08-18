package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibo_1() {
        List<BigInteger> expected_res = Arrays.asList(BigInteger.ZERO);
        Fibonacci fibo = new Fibonacci();
        assertThat(fibo.getFibo(BigInteger.ONE)).isEqualTo(expected_res);
    }

    @Test
    public void fibo_2() {
        List<BigInteger> expected_res = Arrays.asList(BigInteger.ZERO, BigInteger.ONE);
        Fibonacci fibo = new Fibonacci();
        assertThat(fibo.getFibo(BigInteger.valueOf(2))).isEqualTo(expected_res);
    }

    @Test
    public void fibo_300() {
        // https://r-knott.surrey.ac.uk/Fibonacci/fibtable.html
        BigInteger f300 = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
        Fibonacci fibo = new Fibonacci();
        assertThat(
            fibo.getFibo(BigInteger.valueOf(300)).get(299) == f300);
    }

    @Test
    public void fibo_1000() {
        // http://www.fullbooks.com/The-first-1001-Fibonacci-Numbers.html
        BigInteger f1000 = new BigInteger("43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875");
        Fibonacci fibo = new Fibonacci();
        assertThat(
            fibo.getFibo(BigInteger.valueOf(1000)).get(999) == f1000);
    }
}

package ar.edu.untref.dyasc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<BigInteger> getFibo(BigInteger n) {

        final BigInteger n1 = BigInteger.ZERO;
        final BigInteger n2 = BigInteger.ONE;

        List<BigInteger> result = new ArrayList<>();
        BigInteger n_minus_1 = n2;
        BigInteger n_minus_2 = n1;
        BigInteger new_x;

        if (n.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("El valor debe ser mayor que cero.");
        }

        if (n.equals(BigInteger.ONE)) {
            result.add(n1);
            return result;
        }

        if (n.equals(BigInteger.valueOf(2))) {
            result.add(n1);
            result.add(n2);
            return result;
        }

        result.add(n1);
        result.add(n2);

        for (BigInteger x = BigInteger.valueOf(3); x.compareTo(n) <= 0; x = x.add(BigInteger.ONE)) {
            new_x = n_minus_1.add(n_minus_2);
            n_minus_2 = n_minus_1;
            n_minus_1 = new_x;

            result.add(new_x);
        }

        return result;
    }
}

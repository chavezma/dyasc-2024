package ar.edu.untref.dyasc;

public class Fibonacci {

    public Long getFibo(Long n) {

        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        if(n == 1)
            return 0L;
        if(n == 2)
            return 1L;

        return 1L;
    }
}

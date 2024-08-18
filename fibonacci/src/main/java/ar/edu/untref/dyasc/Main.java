package ar.edu.untref.dyasc;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static String generateFibonacciSequence(BigInteger n) {
        Fibonacci fibo = new Fibonacci();
        List<BigInteger> numbers = fibo.getFibo(n);

        return numbers.stream()
                .map(BigInteger::toString)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar un número como argumento.");
            return;
        }

        try {
            BigInteger n = new BigInteger(args[0]);
            System.out.println("Generando secuencia...");
            String result = generateFibonacciSequence(n);
            System.out.println(String.format("fibo<%s>: %s", n.toString(), result));
        } catch (IllegalArgumentException e) {
            System.out.println("El valor ingresado es inválido. Solo se permiten valores enteros positivos.");
        }
    }
}

package ar.edu.untref.dyasc;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe proporcionar un número como argumento.");
            return;
        }

        try {
            Long n = Long.parseLong(args[0]);

            Fibonacci fibo = new Fibonacci();
            System.out.println("Generando secuencia...");
            System.out.println(String.format("fibo<%s>: %s", n.toString(), fibo.getFibo(n).toString()));
        } catch (IllegalArgumentException e) {
            System.out.println("El valor ingresado es inválido. Solo se permiten valores enteros positivos.");
        }
    }
}

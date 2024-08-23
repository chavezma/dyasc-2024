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

    private static void printHelp() {
        System.out.println("Uso:");
        System.out.println("  -o=[v|h][d|i] Orientacion: Formato de impresion de la secuencia (Opcional)");
        System.out.println("  <n>           Largo de la secuencia a generar (Obligatorio)");
    }

    public static void main(String[] args) {

        List<Character> possibleOrientations = List.of('h', 'v');
        List<Character> possibleDirections = List.of('d', 'i');

        boolean isHorizontal = true;
        boolean isDirect = true;

        if (args.length == 0 || args.length > 2) {
            printHelp();
            return;
        }

        if (args.length == 2 && args[0].startsWith("-o=")) {
            
            String options = args[0].substring(3).toLowerCase();
    
            if (options.length() != 2) 
            {
                System.out.println("Cantidad de opciones no es valida.");
                printHelp();
                return;
            }

            char orientation = options.charAt(0);
            char direction = options.charAt(1);

            if (!possibleOrientations.contains(orientation)) {
                System.out.println("Opción no válida para orientacion.");
                printHelp();
                return;
            }
            
            isHorizontal = (orientation == 'h');
            
            if (!possibleDirections.contains(direction)) {
                System.out.println("Opción no válida para direccion.");
                printHelp();
                return;
            }
            
            isDirect = (direction == 'd');
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

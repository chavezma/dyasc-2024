package ar.edu.untref.dyasc;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static String generateFibonacciSequence(BigInteger n, boolean isHorizontal, boolean isDirect) {
        Fibonacci fibo = new Fibonacci();
        List<BigInteger> numbers = fibo.getFibo(n);
        String separator = " ";
        String prefix = "";

        if(!isDirect)
            Collections.reverse(numbers);
        
        if(!isHorizontal) {
            separator = "\n";
            prefix = "\n";
        }
        
        return prefix + numbers.stream()
                .map(BigInteger::toString)
                .collect(Collectors.joining(separator));
    }

    private static void printHelp() {
        System.out.println("Uso: -o=[v|h][d|i] <n>");
        System.out.println("  -o=[v|h][d|i] Orientacion: Formato de impresion de la secuencia (Opcional)");
        System.out.println("  <n>           Largo de la secuencia a generar (Obligatorio)");
    }

    public static void main(String[] args) {

        List<Character> possibleOrientations = List.of('h', 'v');
        List<Character> possibleDirections = List.of('d', 'i');

        boolean isHorizontal = true;
        boolean isDirect = true;

        BigInteger n = null;

        if (args.length == 0 || args.length > 2) {
            printHelp();
            return;
        }
        
        if(args.length == 1) {
            n = new BigInteger(args[0]);
        }

        if (args.length == 2 && args[0].startsWith("-o=")) {
            
            n = new BigInteger(args[1]);

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
            System.out.println("Generando secuencia...");
            String result = generateFibonacciSequence(n, isHorizontal, isDirect);
            System.out.println(String.format("fibo<%s>: %s", n.toString(), result));
        } catch (IllegalArgumentException e) {
            System.out.println("El valor ingresado es inválido. Solo se permiten valores enteros positivos.");
        }
    }
}

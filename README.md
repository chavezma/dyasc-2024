# dyasc-2024
Repositorio para trabajos practicos de Diseño y Arquitectura de sistemas de computación

## Parados en el home de la materia


# Fibonacci

## Compilacion Fibonacci
``` bash
javac -d ./fibonacci/target "C:/UNTREF/Diseno y Arquitectura/dyasc-2024/fibonacci/src/main/java/ar/edu/untref/dyasc/Main.java" "C:/UNTREF/Diseno y Arquitectura/dyasc-2024/fibonacci/src/main/java/ar/edu/untref/dyasc/Fibonacci.java"
``` 

## Armar jar Fibonacci
``` bash
jar cvfe fibo.jar ar.edu.untref.dyasc.Main -C fibonacci/target .
```

## Ejecutar Fibonacci
``` bash
java -jar fibo.jar 1
```

# Fibonacci Orientacion

## Compilacion Fibonacci
``` bash
javac -d ./fibonacci2/target "C:/UNTREF/Diseno y Arquitectura/dyasc-2024/fibonacci2/src/main/java/ar/edu/untref/dyasc/Main.java" "C:/UNTREF/Diseno y Arquitectura/dyasc-2024/fibonacci2/src/main/java/ar/edu/untref/dyasc/Fibonacci.java"
``` 

## Armar jar Fibonacci
``` bash
jar cvfe fibo.jar ar.edu.untref.dyasc.Main -C fibonacci2/target .
```

## Ejecutar Fibonacci
``` bash
java -jar fibo.jar -o=vd 1
```
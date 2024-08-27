# dyasc-2024
Repositorio para trabajos practicos de Diseño y Arquitectura de sistemas de computación

Este codigo se compilar con JAVA 17, tener correctamente configura la variable de entorno JAVA_HOME tanto para el compilador de java como para maven.
Parados en el home de la materia

# Fibonacci 

## 1- Compilacion de forma manual
### Compilar

``` bash
javac -d ./target "./src/main/java/ar/edu/untref/dyasc/Main.java" "./src/main/java/ar/edu/untref/dyasc/Fibonacci.java"
``` 

### Armar jar Fibonacci

``` bash
jar cvfe target/fibo.jar ar.edu.untref.dyasc.Main -C target .
```

## 2- Compilar con Maven 
``` bash
mvn clean package
```

## 3- Ejecucion
``` bash
java -jar target/fibo.jar -o=hd 1
```
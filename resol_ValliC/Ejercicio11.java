package resol_ValliC;

import java.util.Scanner;

public class Ejercicio11 {
    public void ejercicio11() {
        System.out.println("ingrese numero de veces que quiere que se repita la secuencia de fibonacci");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.println("Secuencia de Fibonacci de " + n + " números (versión recursiva):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
        teclado.close();
    }

    public static int fibonacciRecursivo(int n) {
        // Casos base
        if (n <= 1) {
            return n;
        }
        // Caso recursivo: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
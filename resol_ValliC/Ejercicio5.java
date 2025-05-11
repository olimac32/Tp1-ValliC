package resol_ValliC;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine().toLowerCase();
        
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                esPalindromo = false;
                break;
            }
        }
        
        if (esPalindromo) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo");
        }
        
        scanner.close();
    }
}

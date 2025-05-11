package resol_ValliC;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine().toLowerCase();
        
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (esVocal(letra)) {
                contador++;
            }
        }
        System.out.println("La palabra tiene " + contador + " vocales.");
        scanner.close();
    }
    
    public static boolean esVocal(char letra) {
        return  letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú';
    }
}

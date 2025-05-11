package resol_ValliC;

import java.util.ArrayList;

public class Ejercicio14 {
    public void ejercicio14() {
        int Arreglo_cero[][] = {
            {1,2,0,3,0,7},
            {0,0,0,0},
            {0,6,9,8,0,9,6},
            {0,0,0,0,7,9,0,0},
            {0,0,0,0,0},
            {8,7,0,8,9,0,8}
        };
        
        // Lista que contendrá cada fila sin ceros
        ArrayList<int[]> filasSinCeros = new ArrayList<>();

        for (int i = 0; i < Arreglo_cero.length; i++) {
            // Contar cuántos no son ceros
            int contador = 0;
            for (int j = 0; j < Arreglo_cero[i].length; j++) {
                if (Arreglo_cero[i][j] != 0) {
                    contador++;
                }
            }

            // Crear arreglo temporal con tamaño adecuado
            int[] filaSinCeros = new int[contador];
            int k = 0;
            for (int j = 0; j < Arreglo_cero[i].length; j++) {
                if (Arreglo_cero[i][j] != 0) {
                    filaSinCeros[k++] = Arreglo_cero[i][j];
                }
            }

            filasSinCeros.add(filaSinCeros);
        }

        // Imprimir el resultado
        System.out.println("Arreglo sin ceros:");
        for (int[] fila : filasSinCeros) {
            if (fila.length == 0) {
                System.out.println("(fila vacía)");
            } else {
                for (int numero : fila) {
                    System.out.print(numero + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio14 ejercicio = new Ejercicio14();
        ejercicio.ejercicio14();
    }
}
